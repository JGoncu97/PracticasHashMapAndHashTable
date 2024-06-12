package ejercicioHashTableyHashMap;

import java.util.HashMap;
import java.util.Iterator;

public class EjercicioHasMap {
	public static void main(String[]args) {
		//Declara e inicializar un HashMap
		HashMap<Integer, String> mapaNombre= new HashMap<Integer, String>();
		//Agregar valores al mapa
		mapaNombre.put(123, "Jose");
		mapaNombre.put(23, "Daniel");
		mapaNombre.put(12, "Jorge");
		//mapaNombre.put(3, "Julian");
		
		System.out.println(mapaNombre);
		//Imprime solo las llaves
		System.out.println(mapaNombre.keySet());
		//Imprime solo los nombres
		System.out.println(mapaNombre.values());
		//El HashMap permite llaves o nombres con el valor null
		mapaNombre.put(3, null);
		System.out.println(mapaNombre);
		
		if(mapaNombre.containsValue(null)) {
			System.out.println("Efectivamente es null");
		}
		
		//Para recorrer un HashMap utilizamos un iterator mientras con hash table es con enumeration
		
		Iterator<Integer> iterator=mapaNombre.keySet().iterator();
		
		while(iterator.hasNext()) {
			Integer llave= iterator.next();
			System.out.println(llave+" .. "+mapaNombre.get(llave));
		}
		
		/*
		//Para eliminar un valor
		mapaNombre.remove(12);
		System.out.println(mapaNombre);
		
		//Trae un valor del mapa
		System.out.println(mapaNombre.get(23));
		
		//Limpia todo el mapa
		mapaNombre.clear();
		//Para verificar si un valor existe en el mapa utilizamos lo siguiente
		if(mapaNombre.containsValue("Camila")) {
			System.out.println("Si contiene a sofia");
		}else {
			System.out.println("No contiene a sofia");
		}*/
	}

}
