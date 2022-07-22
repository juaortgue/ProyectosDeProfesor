package principal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapas {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("SEVILLA", 60);
		mapa.put("MALAGA", 40);
		mapa.put("MADRID", 40);
		System.out.println(mapa);
		Integer valor = mapa.get("SEVILLA");
		System.out.println("La temperatura de Sevilla es: "+valor+"º");
		System.out.println(mapa.containsKey("SEVILLA"));
		System.out.println(mapa.containsValue(40));
		System.out.println(mapa.containsValue(10));
		System.out.println(mapa.entrySet());
		
//		for(Entry<String, Integer> n: mapa.entrySet()) {
//			System.out.println(n);
//			n.setValue(1);
//		}
//		System.out.println(mapa);
		
		System.out.println("¿Está vacío?"+mapa.isEmpty());
		//OBTENER TODAS LAS CLAVES COMO CONJUNTO
		Set<String> claves = mapa.keySet();
		System.out.println("CLAVES ---->"+claves);
		List<Integer> valores = mapa.values()
				.stream()
				.collect(Collectors.toList());
		System.out.println("VALORES ---->"+valores);

		
		mapa.remove("SEVILLA");
		System.out.println(mapa);
		mapa.clear();
		System.out.println("¿Está vacío?"+mapa.isEmpty());
	}

}
