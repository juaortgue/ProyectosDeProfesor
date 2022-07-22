package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapasListas {

	public static void main(String[] args) {
		Map<String, List<Integer>> mapa = new HashMap<>();
		List<Integer> valores = new ArrayList<>();
		valores.add(38);
		valores.add(42);
		mapa.put("SEVILLA", valores);
		System.out.println(mapa);

		mapa.put("MALAGA", new ArrayList<Integer>());
		// rescatar la antigua lista
		List<Integer> valoresMalaga = mapa.get("MALAGA");
		valoresMalaga.add(10);
		valoresMalaga.add(20);
		// una vez añadidos los nuevos se lo actualizamos al mapa
		mapa.put("MALAGA", valoresMalaga);

		System.out.println(mapa);
//		List<Integer> valoresMurcia = mapa.get("MURCIA");
//		System.out.println(valoresMurcia);
//		valoresMurcia.add(2);

		for (int i = 0; i < 101; i++) {
			List<Integer> valoresMurcia;
			if (mapa.containsKey("MURCIA")) {
				valoresMurcia = mapa.get("MURCIA");
			} else {
				valoresMurcia = new ArrayList<Integer>();
			}

			valoresMurcia.add(i);
			mapa.put("MURCIA", valoresMurcia);
		}
		System.out.println(mapa);
		
		Map<String, List<Double>> pesos = new HashMap<>();
		pesos.put("FELIPE", new ArrayList<>());
		List<Double> valoresPesos;
		if(pesos.containsKey("FELIPE")) {
			valoresPesos = pesos.get("FELIPE");
		}else {
			valoresPesos = new ArrayList<>();
		}
		valoresPesos.add(10.3);
		valoresPesos.add(20.3);
		pesos.put("FELIPE", valoresPesos);
		System.out.println(pesos);
		Map<String, List<Integer>> pesosPepe = new HashMap<>();
		pesosPepe.put("PEPE", new ArrayList<Integer>());
		List<Integer> valoresPepe = pesosPepe.get("PEPE");
		valoresPepe.add(10);
		pesosPepe.put("PEPE", valoresPepe);
		System.out.println(pesosPepe);
		//quiero añadir a LUIS 100 pesos
		for(int i=0;i<101;i++) {
			List<Integer> lista;
			
			if(pesosPepe.containsKey("LUIS")) {
				lista = pesosPepe.get("LUIS");
			}else {
				lista = new ArrayList<Integer>();
			}
			lista.add(i);
			pesosPepe.put("LUIS", lista);
			
		}
		System.out.println(pesosPepe);
		System.out.println("PESOS DE LUIS");
		for(Integer n: pesosPepe.get("LUIS")) {
			System.out.println(n);
			
		}
		//recorrer claves
		for(String clave: pesosPepe.keySet()) {
			System.out.println(clave);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
