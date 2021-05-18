----------------------CLIENTE----------------------------
create or replace NONEDITIONABLE PACKAGE PACK_CLIENTE IS
PROCEDURE BORRAR_CLIENTE (M_ID_CLIENTE IN VARCHAR2);
PROCEDURE BORRAR_PS (M_ID_PS IN VARCHAR2);

PROCEDURE CREAR_CLIENTE (M_NOMBRE IN VARCHAR2,
                         M_APELLIDOS IN VARCHAR2,
                         M_DNI IN VARCHAR2,
                         M_TELEFONO IN VARCHAR2,
                         M_CONTRASENIA IN VARCHAR2,
                         M_EMAIL IN VARCHAR2,                                   
                         M_SEXO IN VARCHAR2, 
                         M_EDAD IN NUMBER,
                         M_PRESUPUESTO_MAXIMO IN NUMBER,                                         
                         M_PESO IN NUMBER,
                         M_ALTURA IN NUMBER,
                         M_COLOR_PIEL IN VARCHAR2,
                         M_ID_PERSONAL_SHOPPER IN VARCHAR2
                        
                         );
PROCEDURE MODIFICAR_CLIENTE (M_ID_CLIENTE IN NUMBER,
                                            M_NOMBRE IN VARCHAR2,
                                           M_APELLIDOS IN VARCHAR2,
                                           M_DNI IN VARCHAR2,
                                           M_TELEFONO IN VARCHAR2,
                                           M_CONTRASENIA IN VARCHAR2,
                                           M_EMAIL IN VARCHAR2,                                   
                                          M_SEXO IN VARCHAR2, 
                                          M_EDAD IN NUMBER,
                                          M_PRESUPUESTO_MAXIMO IN NUMBER,                                         
                                          M_PESO IN NUMBER,
                                          M_ALTURA IN NUMBER,
                                          M_COLOR_PIEL IN VARCHAR2,
                                          M_ID_PERSONAL_SHOPPER IN VARCHAR2

                                            );
END PACK_CLIENTE;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_CLIENTE IS 
PROCEDURE BORRAR_CLIENTE (M_ID_CLIENTE IN VARCHAR2)
IS

BEGIN
UPDATE FACTURA SET factura.id_cliente=NULL
where id_cliente = m_id_cliente;
 delete FROM CLIENTE
where ID_CLIENTE = M_ID_CLIENTE;


END  BORRAR_CLIENTE;

PROCEDURE BORRAR_PS (M_ID_PS IN VARCHAR2)
IS

BEGIN
 delete FROM CLIENTE
where ID_PERSONAL_SHOPPER = M_ID_PS;



END  BORRAR_PS;

PROCEDURE CREAR_CLIENTE (M_NOMBRE IN VARCHAR2,
                         M_APELLIDOS IN VARCHAR2,
                         M_DNI IN VARCHAR2,
                         M_TELEFONO IN VARCHAR2,
                         M_CONTRASENIA IN VARCHAR2,
                         M_EMAIL IN VARCHAR2,                                   
                         M_SEXO IN VARCHAR2, 
                         M_EDAD IN NUMBER,
                         M_PRESUPUESTO_MAXIMO IN NUMBER,                                         
                         M_PESO IN NUMBER,
                         M_ALTURA IN NUMBER,
                         M_COLOR_PIEL IN VARCHAR2,
                         M_ID_PERSONAL_SHOPPER IN VARCHAR2
                         )
                         
                         
                         
IS
BEGIN
    INSERT INTO CLIENTE (ID_CLIENTE,NOMBRE,APELLIDOS,DNI,TELEFONO,CONTRASENIA,
                            EMAIL,SEXO,EDAD,PRESUPUESTO_MAXIMO,PESO,ALTURA,COLOR_PIEL,ID_PERSONAL_SHOPPER)
    VALUES  ( (SELECT MAX(ID_CLIENTE)+1 FROM CLIENTE)
            ,M_NOMBRE
            ,M_APELLIDOS
            ,M_DNI
            ,M_TELEFONO
            ,M_CONTRASENIA
            ,M_EMAIL
            ,M_SEXO
            ,M_EDAD 
            ,M_PRESUPUESTO_MAXIMO
            ,M_PESO
            ,M_ALTURA
            ,M_COLOR_PIEL
            ,M_ID_PERSONAL_SHOPPER 
            );
    COMMIT;
END CREAR_CLIENTE;
PROCEDURE MODIFICAR_CLIENTE (M_ID_CLIENTE IN NUMBER,
                                            M_NOMBRE IN VARCHAR2,
                                           M_APELLIDOS IN VARCHAR2,
                                           M_DNI IN VARCHAR2,
                                           M_TELEFONO IN VARCHAR2,
                                           M_CONTRASENIA IN VARCHAR2,
                                           M_EMAIL IN VARCHAR2,                                   
                                          M_SEXO IN VARCHAR2, 
                                          M_EDAD IN NUMBER,
                                          M_PRESUPUESTO_MAXIMO IN NUMBER,                                         
                                          M_PESO IN NUMBER,
                                          M_ALTURA IN NUMBER,
                                          M_COLOR_PIEL IN VARCHAR2,
                                          M_ID_PERSONAL_SHOPPER IN VARCHAR2
                                          )
IS



BEGIN
UPDATE CLIENTE
SET NOMBRE = M_NOMBRE,
APELLIDOS = M_APELLIDOS,
DNI = M_DNI,
TELEFONO = M_TELEFONO,
CONTRASENIA = M_CONTRASENIA,
EMAIL = M_EMAIL,                                   
SEXO = M_SEXO,
EDAD = M_EDAD,
PRESUPUESTO_MAXIMO = M_PRESUPUESTO_MAXIMO,                                         
PESO = M_PESO,
ALTURA = M_ALTURA,
COLOR_PIEL = M_COLOR_PIEL,
ID_PERSONAL_SHOPPER = M_ID_PERSONAL_SHOPPER

WHERE ID_CLIENTE = M_ID_CLIENTE;


END MODIFICAR_CLIENTE;



END PACK_CLIENTE;
/
----------------------ESTILO--------------------------------
create or replace NONEDITIONABLE PACKAGE BODY PACK_ESTILO IS 
PROCEDURE BORRAR_ESTILO (E_ID_ESTILO IN VARCHAR2)
IS

BEGIN
 delete FROM ESTILO
where ID_ESTILO = E_ID_ESTILO;

END BORRAR_ESTILO;
PROCEDURE CREAR_ESTILO (E_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO ESTILO (ID_ESTILO,NOMBRE)
    VALUES  ( (SELECT MAX(ID_ESTILO)+1 FROM ESTILO)
            , E_NOMBRE
            );
    COMMIT;
END CREAR_ESTILO;
PROCEDURE MODIFICAR_ESTILO (E_ID_ESTILO IN NUMBER , E_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE ESTILO
SET NOMBRE = E_NOMBRE   
WHERE ID_ESTILO = E_ID_ESTILO;

END MODIFICAR_ESTILO;

END PACK_ESTILO;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_ESTILO IS 
PROCEDURE BORRAR_ESTILO (E_ID_ESTILO IN VARCHAR2)
IS

BEGIN
 delete FROM ESTILO
where ID_ESTILO = E_ID_ESTILO;

END BORRAR_ESTILO;


PROCEDURE CREAR_ESTILO (E_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO ESTILO (ID_ESTILO,NOMBRE)
    VALUES  ( (SELECT MAX(ID_ESTILO)+1 FROM ESTILO)
            , E_NOMBRE
            );
    COMMIT;
END CREAR_ESTILO;
PROCEDURE MODIFICAR_ESTILO (E_ID_ESTILO IN NUMBER , E_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE ESTILO
SET NOMBRE = E_NOMBRE   
WHERE ID_ESTILO = E_ID_ESTILO;

END MODIFICAR_ESTILO;

END PACK_ESTILO;
/

------------------------FACTURA-------------------------------
create or replace NONEDITIONABLE PACKAGE BODY PACK_FACTURA IS 
PROCEDURE BORRAR_FACTURA (M_ID_FACTURA IN NUMBER)
IS

BEGIN
 delete FROM FACTURA
where ID_FACTURA = M_ID_FACTURA;



END  BORRAR_FACTURA;



PROCEDURE CREAR_FACTURA(M_PRECIO_TOTAL IN NUMBER,
                         M_FECHA_COMPRA IN VARCHAR2                       
                         )
IS
BEGIN
    INSERT INTO FACTURA (ID_FACTURA,PRECIO_TOTAL,FECHA_COMPRA)
    VALUES  ( (SELECT MAX(ID_FACTURA)+1 FROM FACTURA)
            ,M_PRECIO_TOTAL
            ,M_FECHA_COMPRA          
            );
    COMMIT;
END CREAR_FACTURA;
PROCEDURE MODIFICAR_FACTURA (M_ID_FACTURA IN NUMBER,
                            M_PRECIO_TOTAL IN NUMBER,
                             M_FECHA_COMPRA IN VARCHAR2       
                             )

IS



BEGIN
UPDATE FACTURA
SET PRECIO_TOTAL = M_PRECIO_TOTAL,
FECHA_COMPRA = M_FECHA_COMPRA

WHERE ID_FACTURA = M_ID_FACTURA;


END MODIFICAR_FACTURA;


END PACK_FACTURA;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_FACTURA IS 
PROCEDURE BORRAR_FACTURA (M_ID_FACTURA IN NUMBER)
IS

BEGIN
 delete FROM FACTURA
where ID_FACTURA = M_ID_FACTURA;



END  BORRAR_FACTURA;



PROCEDURE CREAR_FACTURA(M_PRECIO_TOTAL IN NUMBER,
                         M_FECHA_COMPRA IN VARCHAR2                       
                         )
IS
BEGIN
    INSERT INTO FACTURA (ID_FACTURA,PRECIO_TOTAL,FECHA_COMPRA)
    VALUES  ( (SELECT MAX(ID_FACTURA)+1 FROM FACTURA)
            ,M_PRECIO_TOTAL
            ,M_FECHA_COMPRA          
            );
    COMMIT;
END CREAR_FACTURA;
PROCEDURE MODIFICAR_FACTURA (M_ID_FACTURA IN NUMBER,
                            M_PRECIO_TOTAL IN NUMBER,
                             M_FECHA_COMPRA IN VARCHAR2       
                             )

IS



BEGIN
UPDATE FACTURA
SET PRECIO_TOTAL = M_PRECIO_TOTAL,
FECHA_COMPRA = M_FECHA_COMPRA

WHERE ID_FACTURA = M_ID_FACTURA;


END MODIFICAR_FACTURA;


END PACK_FACTURA;
/
-----------------------LINEA FACTURA-----------------------------
create or replace NONEDITIONABLE PACKAGE PACK_LINEA_FACTURA IS
PROCEDURE BORRAR_LINEA_FACTURA (M_ID_LINEA_FACTURA IN NUMBER);
PROCEDURE CREAR_LINEA_FACTURA (M_CANTIDAD IN NUMBER,
                               M_PRECIO_LINEA IN NUMBER                       
                               );
PROCEDURE MODIFICAR_LINEA_FACTURA (M_ID_LINEA_FACTURA IN NUMBER,
                                   M_CANTIDAD IN NUMBER,
                                   M_PRECIO_LINEA IN NUMBER        
                                   );
END PACK_LINEA_FACTURA;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_LINEA_FACTURA IS 
PROCEDURE BORRAR_LINEA_FACTURA (M_ID_LINEA_FACTURA IN NUMBER)
IS

BEGIN
 delete FROM LINEA_FACTURA
where ID_LINEA_FACTURA = M_ID_LINEA_FACTURA;


END  BORRAR_LINEA_FACTURA;



PROCEDURE CREAR_LINEA_FACTURA(M_CANTIDAD IN NUMBER,
                               M_PRECIO_LINEA IN NUMBER                       
                               )
IS
BEGIN
    INSERT INTO LINEA_FACTURA (ID_LINEA_FACTURA,CANTIDAD,PRECIO_LINEA)
    VALUES  ( (SELECT MAX(ID_LINEA_FACTURA)+1 FROM LINEA_FACTURA)
            ,M_CANTIDAD
            ,M_PRECIO_LINEA         
            );
    COMMIT;
END CREAR_LINEA_FACTURA;
PROCEDURE MODIFICAR_LINEA_FACTURA (M_ID_LINEA_FACTURA IN NUMBER,
                                   M_CANTIDAD IN NUMBER,
                                   M_PRECIO_LINEA IN NUMBER        
                                   )

IS



BEGIN
UPDATE LINEA_FACTURA
SET CANTIDAD = M_CANTIDAD,
PRECIO_LINEA = M_PRECIO_LINEA

WHERE ID_LINEA_FACTURA = M_ID_LINEA_FACTURA;


END MODIFICAR_LINEA_FACTURA;


END PACK_LINEA_FACTURA;
/

----------------------MARCA---------------------------------------
create or replace NONEDITIONABLE PACKAGE BODY PACK_MARCA IS 
PROCEDURE BORRAR_MARCA (M_ID_MARCA IN VARCHAR2)
IS

BEGIN
 delete FROM MARCA
where ID_MARCA = M_ID_MARCA;

END BORRAR_MARCA;


PROCEDURE CREAR_MARCA (M_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO MARCA (ID_MARCA,NOMBRE)
    VALUES  ( (SELECT MAX(ID_MARCA)+1 FROM MARCA)
            , M_NOMBRE
            );
    COMMIT;
END CREAR_MARCA;

PROCEDURE MODIFICAR_MARCA (M_ID_MARCA IN NUMBER , M_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE MARCA
SET NOMBRE = M_NOMBRE   
WHERE ID_MARCA = M_ID_MARCA;

END MODIFICAR_MARCA;


END PACK_MARCA;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_MARCA IS 
PROCEDURE BORRAR_MARCA (M_ID_MARCA IN VARCHAR2)
IS

BEGIN
 delete FROM MARCA
where ID_MARCA = M_ID_MARCA;

END BORRAR_MARCA;


PROCEDURE CREAR_MARCA (M_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO MARCA (ID_MARCA,NOMBRE)
    VALUES  ( (SELECT MAX(ID_MARCA)+1 FROM MARCA)
            , M_NOMBRE
            );
    COMMIT;
END CREAR_MARCA;

PROCEDURE MODIFICAR_MARCA (M_ID_MARCA IN NUMBER , M_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE MARCA
SET NOMBRE = M_NOMBRE   
WHERE ID_MARCA = M_ID_MARCA;

END MODIFICAR_MARCA;


END PACK_MARCA;
/

---------------------PERSONAL SHOPPER-------------------------------
create or replace NONEDITIONABLE PACKAGE PACK_PERSONAL_SHOPPER IS
PROCEDURE BORRAR_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN VARCHAR2);
PROCEDURE CREAR_PERSONAL_SHOPPER (M_NOMBRE IN VARCHAR2,
                                                    M_APELLIDOS IN VARCHAR2, 
                                                    M_DNI IN VARCHAR2,
                                                    M_TELEFONO IN VARCHAR2,
                                                    M_CONTRASENIA IN VARCHAR2,
                                                    M_EMAIL IN VARCHAR2);

PROCEDURE MODIFICAR_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN NUMBER,
                                                    M_NOMBRE IN VARCHAR2,
                                                    M_APELLIDOS IN VARCHAR2, 
                                                    M_DNI IN VARCHAR2,
                                                    M_TELEFONO IN VARCHAR2,
                                                    M_CONTRASENIA IN VARCHAR2,
                                                    M_EMAIL IN VARCHAR2);
PROCEDURE MODIFICAR_ADDCLIENTE_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN NUMBER,
                                                M_ID_CLIENTE IN NUMBER  );                                                  
END PACK_PERSONAL_SHOPPER;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_PERSONAL_SHOPPER IS 
PROCEDURE BORRAR_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN VARCHAR2)
IS

BEGIN
 delete FROM PERSONAL_SHOPPER
where ID_PERSONAL_SHOPPER = M_ID_PERSONAL_SHOPPER;

END BORRAR_PERSONAL_SHOPPER;



PROCEDURE CREAR_PERSONAL_SHOPPER (M_NOMBRE IN VARCHAR2,
                                                    M_APELLIDOS IN VARCHAR2, 
                                                    M_DNI IN VARCHAR2,
                                                    M_TELEFONO IN VARCHAR2,
                                                    M_CONTRASENIA IN VARCHAR2,
                                                    M_EMAIL IN VARCHAR2)
IS
BEGIN
    INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER,NOMBRE,APELLIDOS,DNI,TELEFONO,CONTRASENIA,EMAIL)
    VALUES  ( (SELECT MAX(ID_PERSONAL_SHOPPER)+1 FROM PERSONAL_SHOPPER)
            , M_NOMBRE,M_APELLIDOS,M_DNI,M_TELEFONO,M_CONTRASENIA,M_EMAIL
            );
    COMMIT;
END CREAR_PERSONAL_SHOPPER;

PROCEDURE MODIFICAR_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN NUMBER,
                                                    M_NOMBRE IN VARCHAR2,
                                                    M_APELLIDOS IN VARCHAR2, 
                                                    M_DNI IN VARCHAR2,
                                                    M_TELEFONO IN VARCHAR2,
                                                    M_CONTRASENIA IN VARCHAR2,
                                                    M_EMAIL IN VARCHAR2)
IS

BEGIN
 UPDATE PERSONAL_SHOPPER
SET NOMBRE = M_NOMBRE,
APELLIDOS = M_APELLIDOS,
DNI = M_DNI,
TELEFONO = M_TELEFONO,
CONTRASENIA = M_CONTRASENIA,
EMAIL = M_EMAIL

WHERE ID_PERSONAL_SHOPPER = M_ID_PERSONAL_SHOPPER;

END MODIFICAR_PERSONAL_SHOPPER;

PROCEDURE MODIFICAR_ADDCLIENTE_PERSONAL_SHOPPER (M_ID_PERSONAL_SHOPPER IN NUMBER,
                                                        M_ID_CLIENTE IN NUMBER  )
IS

BEGIN
 UPDATE CLIENTE
SET ID_PERSONAL_SHOPPER = M_ID_PERSONAL_SHOPPER

WHERE ID_PERSONAL_SHOPPER = M_ID_PERSONAL_SHOPPER;

END MODIFICAR_ADDCLIENTE_PERSONAL_SHOPPER;



END PACK_PERSONAL_SHOPPER;
/

---------------------------PRODUCTO----------------------------------
create or replace NONEDITIONABLE PACKAGE PACK_PRODUCTO IS
PROCEDURE BORRAR_PRODUCTO (M_ID_PRODUCTO IN VARCHAR2);
PROCEDURE CREAR_PRODUCTO (M_NOMBRE IN VARCHAR2,
                                          M_PRECIO IN NUMBER,
                                          M_TALLA IN VARCHAR2,
                                          M_SEXO IN VARCHAR2,
                                          M_IVA IN NUMBER,
                                          M_DESCUENTO IN NUMBER,
                                          M_ID_MARCA IN NUMBER,
                                          M_ID_TIPO_PRODUCTO IN NUMBER
                                             );
PROCEDURE MODIFICAR_PRODUCTO (M_ID_PRODUCTO IN NUMBER ,
                              M_NOMBRE IN VARCHAR2,
                              M_PRECIO IN NUMBER,
                              M_TALLA IN VARCHAR2,
                              M_SEXO IN VARCHAR2,
                              M_IVA IN NUMBER,
                              M_DESCUENTO IN NUMBER);
END PACK_PRODUCTO;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_PRODUCTO IS 
PROCEDURE BORRAR_PRODUCTO (M_ID_PRODUCTO IN VARCHAR2)
IS

BEGIN
 delete FROM PRODUCTO
where ID_PRODUCTO = M_ID_PRODUCTO;

END BORRAR_PRODUCTO;



PROCEDURE CREAR_PRODUCTO (M_NOMBRE IN VARCHAR2,
                                          M_PRECIO IN NUMBER,
                                          M_TALLA IN VARCHAR2,
                                          M_SEXO IN VARCHAR2,
                                          M_IVA IN NUMBER,
                                          M_DESCUENTO IN NUMBER,
                                          M_ID_MARCA IN NUMBER,
                                          M_ID_TIPO_PRODUCTO IN NUMBER
                                             )
IS
BEGIN
    INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_MARCA,ID_TIPO_PRODUCTO)
    VALUES  ( (SELECT MAX(ID_PRODUCTO)+1 FROM PRODUCTO)
            , M_NOMBRE
            ,M_PRECIO
            ,M_TALLA
            ,M_SEXO
            ,M_IVA
            ,M_DESCUENTO
            ,M_ID_MARCA
            ,M_ID_TIPO_PRODUCTO
            );
    COMMIT;
END CREAR_PRODUCTO;
PROCEDURE MODIFICAR_PRODUCTO (M_ID_PRODUCTO IN NUMBER ,
                              M_NOMBRE IN VARCHAR2,
                              M_PRECIO IN NUMBER,
                              M_TALLA IN VARCHAR2,
                              M_SEXO IN VARCHAR2,
                              M_IVA IN NUMBER,
                              M_DESCUENTO IN NUMBER)
IS

BEGIN
 UPDATE PRODUCTO
SET NOMBRE = M_NOMBRE,
PRECIO = M_PRECIO,
TALLA = M_TALLA,
SEXO = M_SEXO,
IVA = M_IVA,
DESCUENTO = M_DESCUENTO
WHERE ID_PRODUCTO = M_ID_PRODUCTO;

END MODIFICAR_PRODUCTO;

END PACK_PRODUCTO;
/

-------------------------RANKING-------------------------------------
create or replace NONEDITIONABLE PACKAGE PACK_RANKING IS
PROCEDURE BORRAR_RANKING (M_ID_RANKING IN NUMBER);
PROCEDURE CREAR_RANKING (M_FECHA IN VARCHAR2,
                         M_DINERO_FACTURADO IN NUMBER,
                         M_COMISION IN NUMBER                       
                         );
PROCEDURE MODIFICAR_RANKING (M_ID_RANKING IN NUMBER,
                             M_FECHA IN VARCHAR2,
                             M_DINERO_FACTURADO IN NUMBER,
                             M_COMISION IN NUMBER         
                             );
END PACK_RANKING;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_RANKING IS 
PROCEDURE BORRAR_RANKING (M_ID_RANKING IN NUMBER)
IS

BEGIN
 delete FROM RANKING
where ID_RANKING = M_ID_RANKING;


END  BORRAR_RANKING;



PROCEDURE CREAR_RANKING(M_FECHA IN VARCHAR2,
                         M_DINERO_FACTURADO IN NUMBER,
                         M_COMISION IN NUMBER                       
                         )
IS
BEGIN
    INSERT INTO RANKING (ID_RANKING,FECHA,DINERO_FACTURADO,COMISION)
    VALUES  ( (SELECT MAX(ID_RANKING)+1 FROM RANKING)
           ,M_FECHA 
           ,M_DINERO_FACTURADO 
           ,M_COMISION       
            );
    COMMIT;
END CREAR_RANKING;
PROCEDURE MODIFICAR_RANKING (M_ID_RANKING IN NUMBER,
                             M_FECHA IN VARCHAR2,
                             M_DINERO_FACTURADO IN NUMBER,
                             M_COMISION IN NUMBER         
                             )

IS



BEGIN
UPDATE RANKING
SET FECHA = M_FECHA,
DINERO_FACTURADO = M_DINERO_FACTURADO,
COMISION = M_COMISION

WHERE ID_RANKING = M_ID_RANKING;


END MODIFICAR_RANKING;


END PACK_RANKING;
/

-------------------------TIENDA-------------------------------------
create or replace NONEDITIONABLE PACKAGE BODY PACK_TIENDA IS 
PROCEDURE BORRAR_TIENDA (M_ID_TIENDA IN VARCHAR2)
IS

BEGIN
 delete FROM TIENDA
where ID_TIENDA = M_ID_TIENDA;

END BORRAR_TIENDA;



PROCEDURE CREAR_TIENDA (M_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO TIENDA (ID_TIENDA,NOMBRE)
    VALUES  ( (SELECT MAX(ID_TIENDA)+1 FROM TIENDA)
            , M_NOMBRE
            );
    COMMIT;
END CREAR_TIENDA;
PROCEDURE MODIFICAR_TIENDA (M_ID_TIENDA IN NUMBER , M_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE TIENDA
SET NOMBRE = M_NOMBRE  
WHERE ID_TIENDA = M_ID_TIENDA;

END MODIFICAR_TIENDA;



END PACK_TIENDA;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_TIENDA IS 
PROCEDURE BORRAR_TIENDA (M_ID_TIENDA IN VARCHAR2)
IS

BEGIN
 delete FROM TIENDA
where ID_TIENDA = M_ID_TIENDA;

END BORRAR_TIENDA;



PROCEDURE CREAR_TIENDA (M_NOMBRE IN VARCHAR2)
IS
BEGIN
    INSERT INTO TIENDA (ID_TIENDA,NOMBRE)
    VALUES  ( (SELECT MAX(ID_TIENDA)+1 FROM TIENDA)
            , M_NOMBRE
            );
    COMMIT;
END CREAR_TIENDA;
PROCEDURE MODIFICAR_TIENDA (M_ID_TIENDA IN NUMBER , M_NOMBRE IN VARCHAR2)
IS

BEGIN
 UPDATE TIENDA
SET NOMBRE = M_NOMBRE  
WHERE ID_TIENDA = M_ID_TIENDA;

END MODIFICAR_TIENDA;

END PACK_TIENDA;
/

-----------------------TIPO_PRODUCTO------------------------------------
create or replace NONEDITIONABLE PACKAGE BODY PACK_TIPO_PRODUCTO IS 
PROCEDURE BORRAR_TIPO_PRODUCTO (M_ID_TIPO_PRODUCTO IN NUMBER)
IS

BEGIN
 delete FROM TIPO_PRODUCTO
where ID_TIPO_PRODUCTO = M_ID_TIPO_PRODUCTO;



END  BORRAR_TIPO_PRODUCTO;



PROCEDURE CREAR_TIPO_PRODUCTO(M_NOMBRE IN VARCHAR2                      
                               )
IS
BEGIN
    INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO,NOMBRE)
    VALUES  ( (SELECT MAX(ID_TIPO_PRODUCTO)+1 FROM TIPO_PRODUCTO)
            ,M_NOMBRE     
            );
    COMMIT;
END CREAR_TIPO_PRODUCTO;
PROCEDURE MODIFICAR_TIPO_PRODUCTO (M_ID_TIPO_PRODUCTO IN NUMBER,
                                   M_NOMBRE IN VARCHAR2        
                                   )

IS


BEGIN
UPDATE TIPO_PRODUCTO
SET NOMBRE = M_NOMBRE


WHERE ID_TIPO_PRODUCTO = M_ID_TIPO_PRODUCTO;


END MODIFICAR_TIPO_PRODUCTO;


END PACK_TIPO_PRODUCTO;
/
create or replace NONEDITIONABLE PACKAGE BODY PACK_TIPO_PRODUCTO IS 
PROCEDURE BORRAR_TIPO_PRODUCTO (M_ID_TIPO_PRODUCTO IN NUMBER)
IS

BEGIN
 delete FROM TIPO_PRODUCTO
where ID_TIPO_PRODUCTO = M_ID_TIPO_PRODUCTO;


END  BORRAR_TIPO_PRODUCTO;



PROCEDURE CREAR_TIPO_PRODUCTO(M_NOMBRE IN VARCHAR2                      
                               )
IS
BEGIN
    INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO,NOMBRE)
    VALUES  ( (SELECT MAX(ID_TIPO_PRODUCTO)+1 FROM TIPO_PRODUCTO)
            ,M_NOMBRE     
            );
    COMMIT;
END CREAR_TIPO_PRODUCTO;
PROCEDURE MODIFICAR_TIPO_PRODUCTO (M_ID_TIPO_PRODUCTO IN NUMBER,
                                   M_NOMBRE IN VARCHAR2        
                                   )

IS


BEGIN
UPDATE TIPO_PRODUCTO
SET NOMBRE = M_NOMBRE


WHERE ID_TIPO_PRODUCTO = M_ID_TIPO_PRODUCTO;


END MODIFICAR_TIPO_PRODUCTO;


END PACK_TIPO_PRODUCTO;