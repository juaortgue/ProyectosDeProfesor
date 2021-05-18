DROP TABLE MARCA CASCADE CONSTRAINTS;
DROP TABLE TIENDA CASCADE CONSTRAINTS;
DROP TABLE TIPO_PRODUCTO CASCADE CONSTRAINTS;
DROP TABLE RANKING CASCADE CONSTRAINTS;
DROP TABLE ESTILO CASCADE CONSTRAINTS;
DROP TABLE PERSONAL_SHOPPER CASCADE CONSTRAINTS;
DROP TABLE CLIENTE CASCADE CONSTRAINTS;
DROP TABLE TIENDA_CLIENTE CASCADE CONSTRAINTS;
DROP TABLE FACTURA CASCADE CONSTRAINTS;
DROP TABLE PRODUCTO CASCADE CONSTRAINTS;
DROP TABLE LINEA_FACTURA CASCADE CONSTRAINTS;
DROP TABLE ESTILO_CLIENTE  CASCADE CONSTRAINTS;

DROP SEQUENCE  SEQ_MARCA;
DROP SEQUENCE  SEQ_TIENDA;
DROP SEQUENCE  SEQ_TIPO_PRODUCTO;
DROP SEQUENCE  SEQ_RANKING;
DROP SEQUENCE  SEQ_ESTILO;
DROP SEQUENCE  SEQ_PERSONAL_SHOPPER;
DROP SEQUENCE  SEQ_CLIENTE;
DROP SEQUENCE  SEQ_TIENDA_CLIENTE;
DROP SEQUENCE  SEQ_FACTURA;
DROP SEQUENCE  SEQ_PRODUCTO;
DROP SEQUENCE  SEQ_LINEA_FACTURA;
DROP SEQUENCE  SEQ_ESTILO_CLIENTE;

CREATE SEQUENCE  SEQ_MARCA;
CREATE SEQUENCE  SEQ_TIENDA;
CREATE SEQUENCE  SEQ_TIPO_PRODUCTO;
CREATE SEQUENCE  SEQ_RANKING;
CREATE SEQUENCE  SEQ_ESTILO;
CREATE SEQUENCE  SEQ_PERSONAL_SHOPPER;
CREATE SEQUENCE  SEQ_CLIENTE;
CREATE SEQUENCE  SEQ_TIENDA_CLIENTE;
CREATE SEQUENCE  SEQ_FACTURA;
CREATE SEQUENCE  SEQ_PRODUCTO;
CREATE SEQUENCE  SEQ_LINEA_FACTURA;
CREATE SEQUENCE  SEQ_ESTILO_CLIENTE;


CREATE TABLE MARCA 
    (ID_MARCA NUMBER(10) NOT NULL
     ,NOMBRE VARCHAR2(30) NOT NULL
     ,CONSTRAINT PK_MARCA PRIMARY KEY (ID_MARCA)
);


INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'NIKE');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'ADIDAS');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'ZARA');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'ADOLFO DOMINGUEZ');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'BIMBA AND LOLA');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'PULL AND BEAR');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'GUCCI');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'PRADA');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'H AND M');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'DIOR');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'MASSIMO DUTTI');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'UTERQUE');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'ALVARO MORENO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'SCALPERS');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'PEDRO DEL HIERRO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'LACOSTE');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'TOMMY HILFIGER');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'PUROEGO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'SPAGNOLO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'GIVENCHY');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'BALENCIAGA');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'KENZO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'LOUIS VUITTON');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'ARMANI');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'BURBERRY');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'CALVIN KLEIN');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'DKNY');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'RALPH LAUREN');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'VALENTINE');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'HUGO BOSS');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'MANGO');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'PEPE JEANS');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'MAYORAL');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'SILBON');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'DESIGUAL');
INSERT INTO MARCA (ID_MARCA, NOMBRE) VALUES(SEQ_MARCA.NEXTVAL,'SPRINGFIELD');

SELECT * FROM MARCA;


CREATE TABLE TIENDA 
    (ID_TIENDA NUMBER(10) NOT NULL
     ,NOMBRE VARCHAR2(30) NOT NULL
     ,CONSTRAINT PK_TIENDA PRIMARY KEY (ID_TIENDA)
);

INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'EL CORTE INGLES');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'Boutique La Folie');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'AIRE MODAS Y COMPLEMENTOS');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'MERYFOR');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'SCOTTA 1985');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'ARENAL DE SEVILLA');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'7 COLORES');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'SFERA');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'BOSTON');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'JIRO MODAS');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'PARFOIS');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'CELOP');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'PRIMARK');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'FRIKING');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'FESTA');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'MARBEL WEAR');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'DECIMAS');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'TRUCCO');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'M53');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'VIANNCHI');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'INTIMISSIMI');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'PINKIE');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'ARMI�O');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'GARBO');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'ONTARA');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'JALEO');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'PILAR DEL TORO');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'ANA FAURA');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'MARTA SOTO');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'LITLE KING');
INSERT INTO TIENDA (ID_TIENDA, NOMBRE) VALUES(SEQ_TIENDA.NEXTVAL,'INSIDE');


SELECT * FROM TIENDA;


CREATE TABLE TIPO_PRODUCTO 
    (ID_TIPO_PRODUCTO NUMBER(10) NOT NULL
     ,NOMBRE VARCHAR2(30) NOT NULL
     ,CONSTRAINT PK_TIPO_PRODUCTO PRIMARY KEY (ID_TIPO_PRODUCTO)
);

INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO, NOMBRE) VALUES(SEQ_TIPO_PRODUCTO.NEXTVAL,'ROPA CABALLERO');
INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO, NOMBRE) VALUES(SEQ_TIPO_PRODUCTO.NEXTVAL,'ROPA MUJER');
INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO, NOMBRE) VALUES(SEQ_TIPO_PRODUCTO.NEXTVAL,'COMPLEMENTOS CABALLERO');
INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO, NOMBRE) VALUES(SEQ_TIPO_PRODUCTO.NEXTVAL,'COMPLEMENTOS MUJER');
INSERT INTO TIPO_PRODUCTO (ID_TIPO_PRODUCTO, NOMBRE) VALUES(SEQ_TIPO_PRODUCTO.NEXTVAL,'COMPLEMENTOS MUJER');


CREATE TABLE RANKING 
    (ID_RANKING NUMBER(10) NOT NULL
     ,FECHA VARCHAR2(30) NOT NULL
     ,DINERO_FACTURADO NUMBER(10,2) NOT NULL
     ,COMISION NUMBER(4) NOT NULL
     ,CONSTRAINT PK_RANKING PRIMARY KEY (ID_RANKING)
     ,CONSTRAINT DINERO_FACTURADO_ERRONEO CHECK (DINERO_FACTURADO>=0)
);

INSERT INTO RANKING (ID_RANKING, FECHA, DINERO_FACTURADO, COMISION) VALUES(SEQ_RANKING.NEXTVAL,'21/04/2021', 100.300, 10.5);
INSERT INTO RANKING (ID_RANKING, FECHA, DINERO_FACTURADO, COMISION) VALUES(SEQ_RANKING.NEXTVAL,'21/03/2021', 400.300, 40.5);


CREATE TABLE ESTILO 
    (ID_ESTILO NUMBER(10) NOT NULL
     ,NOMBRE VARCHAR2(50) NOT NULL
     ,CONSTRAINT PK_ESTILO PRIMARY KEY (ID_ESTILO)
);   

INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'CLASICO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'FORMAL');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'SPORTY');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'LADY ROMANTICO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'LADY HIPSTER');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'DEPORTIVO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'MINIMALISTA');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'VANGUARDISTA');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'BOHEMIO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'INFORMAL');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'URBANO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'GOTICO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'EJECUTIVO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'SURFERO');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'HIPSTER');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'PUNK');
INSERT INTO ESTILO (ID_ESTILO, NOMBRE) VALUES(SEQ_ESTILO.NEXTVAL,'HIPPIE');




CREATE TABLE PERSONAL_SHOPPER
        (ID_PERSONAL_SHOPPER NUMBER(10)
        ,NOMBRE VARCHAR2(200) NOT NULL
        ,APELLIDOS VARCHAR2(200) NOT NULL
        ,DNI VARCHAR2(12) NOT NULL
        ,TELEFONO VARCHAR2(12) NULL
        ,CONTRASENIA VARCHAR2(50) NOT NULL
        ,EMAIL VARCHAR2(200) NOT NULL
        ,ID_RANKING NUMBER(10) 
        ,CONSTRAINT PK_PERSONAL_SHOPPER PRIMARY KEY (ID_PERSONAL_SHOPPER)
        ,FOREIGN KEY (ID_RANKING) REFERENCES RANKING (ID_RANKING)
        );
        
INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,ID_RANKING)
    VALUES(SEQ_PERSONAL_SHOPPER.NEXTVAL,'ANTONIO', 'ROMERO MURUBE', '41263145T', '665563251','1234','MRANTONUIO@GMAIL.COM',1);
 INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,ID_RANKING)
    VALUES(SEQ_PERSONAL_SHOPPER.NEXTVAL,'MARIA', 'SANCHEZ LOPEZ', '52341234O', '664495252','4321','MARIASL@GMAIL.COM',2);
INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,ID_RANKING)
    VALUES(SEQ_PERSONAL_SHOPPER.NEXTVAL,'SOFIA', 'GOMEZ JIMENEZ', '47559934O', '647895254','8461','SOFIAGJ@GMAIL.COM',2);     
INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,ID_RANKING)
    VALUES(SEQ_PERSONAL_SHOPPER.NEXTVAL,'ENRIQUE', 'ARJONES SANCHEZ', '57259934O', '685796554','2761','ERQ@GMAIL.COM',1);     
INSERT INTO PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,ID_RANKING)
    VALUES(SEQ_PERSONAL_SHOPPER.NEXTVAL,'ANTONIO', 'SANCHEZ ARJONES ', '59589744O', '666156554','2071','ANTOARS@GMAIL.COM',2);     


CREATE TABLE CLIENTE
        (ID_CLIENTE NUMBER(10)NOT NULL
        ,NOMBRE VARCHAR2(50) NOT NULL
        ,APELLIDOS VARCHAR2(50) NOT NULL
        ,DNI VARCHAR2(12) NOT NULL
        ,TELEFONO NUMBER(11) NULL
        ,CONTRASENIA VARCHAR2(15) NOT NULL
        ,EMAIL VARCHAR2(64) NOT NULL
        ,SEXO VARCHAR2(20) NOT NULL
        ,EDAD NUMBER (3)NULL
        ,PRESUPUESTO_MAXIMO NUMBER(5) NOT NULL
        ,PESO NUMBER(7,2) NOT NULL
        ,ALTURA NUMBER(7,2) NOT NULL
        ,COLOR_PIEL VARCHAR2(20) NOT NULL
        ,ID_PERSONAL_SHOPPER NUMBER(10) NULL
        ,CONSTRAINT PK_ID_CLIENTE PRIMARY KEY (ID_CLIENTE)
        ,FOREIGN KEY (ID_PERSONAL_SHOPPER) REFERENCES PERSONAL_SHOPPER (ID_PERSONAL_SHOPPER)
);
        
        ALTER TABLE CLIENTE ADD CONSTRAINTS UK_DNI UNIQUE(DNI);
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,SEXO,EDAD,PRESUPUESTO_MAXIMO, PESO,ALTURA,COLOR_PIEL,ID_PERSONAL_SHOPPER)
    VALUES(SEQ_CLIENTE.NEXTVAL ,'JUAN', 'LOPEZ GUERRA', '57986234P', '65545252','4987','JUANLG@GMAIL.COM','H',50,500,100,1.80,'MORENO',2);

INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,SEXO,EDAD,PRESUPUESTO_MAXIMO, PESO,ALTURA,COLOR_PIEL,ID_PERSONAL_SHOPPER)
     VALUES(SEQ_CLIENTE.NEXTVAL ,'PEPA', 'LOPEZ LOPEZ', '97986234P', '15545252','5987','PEPA@GMAIL.COM','M',52,600,100,1.70,'AMARILLA',1);
     SELECT * FROM CLIENTE;
INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE, APELLIDOS, DNI, TELEFONO, CONTRASENIA, EMAIL,SEXO,EDAD,PRESUPUESTO_MAXIMO, PESO,ALTURA,COLOR_PIEL,ID_PERSONAL_SHOPPER)
     VALUES(SEQ_CLIENTE.NEXTVAL ,'REYES', 'JIMENEZ SANTOS', '45976274Q', '27545252','8987','REYES@GMAIL.COM','M',52,100,56,1.52,'BLANCA',2);
     SELECT * FROM CLIENTE;
CREATE TABLE TIENDA_CLIENTE
    (ID_TIENDA_CLIENTE NUMBER(10) NOT NULL
     ,ID_TIENDA NUMBER(10) NOT NULL
     ,ID_CLIENTE NUMBER(10) NOT NULL
     ,CONSTRAINT PK_TIENDA_CLIENTE PRIMARY KEY (ID_TIENDA_CLIENTE)
     ,FOREIGN KEY (ID_TIENDA) REFERENCES TIENDA (ID_TIENDA)
     ,FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE)
); 

INSERT INTO TIENDA_CLIENTE (ID_TIENDA_CLIENTE, ID_TIENDA,ID_CLIENTE) VALUES(SEQ_TIENDA_CLIENTE.NEXTVAL,1,1);
INSERT INTO TIENDA_CLIENTE (ID_TIENDA_CLIENTE, ID_TIENDA,ID_CLIENTE) VALUES(SEQ_TIENDA_CLIENTE.NEXTVAL,2,2);
        
CREATE TABLE FACTURA 
    (ID_FACTURA NUMBER(10) NOT NULL
     ,PRECIO_TOTAL NUMBER(7,2)NOT NULL
     ,FECHA_COMPRA VARCHAR2(30) NOT NULL
     ,ID_CLIENTE NUMBER(10) NULL
     ,CONSTRAINT PK_FACTURA PRIMARY KEY (ID_FACTURA)
     ,FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE)
);
   
  INSERT INTO FACTURA (ID_FACTURA,PRECIO_TOTAL,FECHA_COMPRA,ID_CLIENTE) VALUES(SEQ_FACTURA.NEXTVAL,500.78,'21/04/2021',2);
  INSERT INTO FACTURA (ID_FACTURA,PRECIO_TOTAL,FECHA_COMPRA,ID_CLIENTE) VALUES(SEQ_FACTURA.NEXTVAL,100.58,'19/02/2021',1);

    
CREATE TABLE PRODUCTO
        (ID_PRODUCTO NUMBER(10)NOT NULL
        ,NOMBRE VARCHAR2(50) NOT NULL UNIQUE
        ,PRECIO NUMBER(10, 2) NOT NULL
        ,TALLA VARCHAR2(10) NOT NULL
        ,SEXO VARCHAR2(20) NOT NULL
        ,IVA NUMBER (7, 2)NOT NULL
        ,DESCUENTO NUMBER(7, 2)NULL
        ,ID_TIPO_PRODUCTO NUMBER(10) NULL
        ,ID_MARCA NUMBER(10)  NULL
        ,CONSTRAINT PK_ID_PRODUCTO PRIMARY KEY (ID_PRODUCTO)
        ,FOREIGN KEY (ID_TIPO_PRODUCTO) REFERENCES TIPO_PRODUCTO (ID_TIPO_PRODUCTO)        
        ,FOREIGN KEY (ID_MARCA) REFERENCES MARCA (ID_MARCA)
    );   
INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_TIPO_PRODUCTO,ID_MARCA) 
    VALUES(SEQ_PRODUCTO.NEXTVAL,'ANILLO',30.5,'S','H',21,0,3,1);   
INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_TIPO_PRODUCTO,ID_MARCA) 
    VALUES(SEQ_PRODUCTO.NEXTVAL,'JERSEY',50,'M','M',21,0,2,4);
 INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_TIPO_PRODUCTO,ID_MARCA) 
    VALUES(SEQ_PRODUCTO.NEXTVAL,'PANTALON RECTO',35,'L','M',21,0,2,4);
INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_TIPO_PRODUCTO,ID_MARCA) 
    VALUES(SEQ_PRODUCTO.NEXTVAL,'BLUSA DE SEDA',145,'XL','M',21,0,2,15);
INSERT INTO PRODUCTO (ID_PRODUCTO,NOMBRE,PRECIO,TALLA,SEXO,IVA,DESCUENTO,ID_TIPO_PRODUCTO,ID_MARCA) 
    VALUES(SEQ_PRODUCTO.NEXTVAL,'CHAQUETA',200,'M','H',21,0,1,20);
    
    
CREATE TABLE LINEA_FACTURA 
    (ID_LINEA_FACTURA NUMBER(10) NOT NULL
     ,CANTIDAD NUMBER(10) NOT NULL
     ,PRECIO_LINEA NUMBER(7,2) NOT NULL
     ,ID_FACTURA NUMBER(10) NULL
     ,ID_PRODUCTO NUMBER(10)NULL
     ,CONSTRAINT PK_ID_LINEA_FACTURA PRIMARY KEY (ID_LINEA_FACTURA)
     ,FOREIGN KEY (ID_FACTURA) REFERENCES FACTURA(ID_FACTURA)
     ,FOREIGN KEY (ID_PRODUCTO) REFERENCES PRODUCTO(ID_PRODUCTO)
    );
    
  INSERT INTO LINEA_FACTURA (ID_LINEA_FACTURA,CANTIDAD,PRECIO_LINEA,ID_FACTURA,ID_PRODUCTO) 
  VALUES(SEQ_LINEA_FACTURA.NEXTVAL,3,150,1,2);
  
    
    
CREATE TABLE ESTILO_CLIENTE 
    (ID_ESTILO_CLIENTE NUMBER(10) NOT NULL
     ,ID_ESTILO NUMBER(10) NOT NULL
     ,ID_CLIENTE NUMBER(10) NOT NULL
     ,CONSTRAINT PK_ESTILO_CLIENTE PRIMARY KEY (ID_ESTILO_CLIENTE)
     ,FOREIGN KEY (ID_ESTILO) REFERENCES ESTILO(ID_ESTILO)
     ,FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE(ID_CLIENTE)
    );
INSERT INTO ESTILO_CLIENTE (ID_ESTILO_CLIENTE,ID_ESTILO,ID_CLIENTE) 
  VALUES(SEQ_ESTILO_CLIENTE.NEXTVAL,1,1);