package ejercicioHashTableyHashMap;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class EjercicioHashTable {
	public static void main(String[]args) {
		EjercicioHashTable miHashTable= new EjercicioHashTable();
		miHashTable.iniciar();
	}
	
	public void iniciar() {
		//Declara e iniciarlizar un hashTable
		Hashtable<Integer, String>tablaNombres= new Hashtable<Integer,String>();
		//Para recorrer una tabla de elementos hacemos lo siguiente
		for(int i=0; i< 5; i++) {
			//Agregar valores a una tabla has table utilizanto .put
			Integer key=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una clave"));
			String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
			tablaNombres.put(key, nombre);
		}
		System.out.println(tablaNombres);
		
		//Agregar valores a una tabla has table utilizanto .put
		tablaNombres.put(123, "Jose");
		tablaNombres.put(25, "Daniel");
		tablaNombres.put(543, "Jorge");
		tablaNombres.put(32, "Julian");
		
		System.out.println(tablaNombres);
		
		//Para remover un valor de la tabla
		tablaNombres.remove(32);
		
		
		//utilizamos containsKey para verificar su existencia con la llame valor
		if(tablaNombres.containsKey(32)) {
			System.out.println("Si existe");
		}else {
			System.out.println("No existe");
		}
		
		//Acceder a los valores
		System.out.println(tablaNombres.get(123));
		//Para imprimir el tamaño de la tabla
		System.out.println(tablaNombres.size());
		//Para mostrar la totalidad de la informacion guardada de forma aleatoria
		System.out.println(tablaNombres);
		
		recorrerTablaHash(tablaNombres);
		
		
	}

	private void recorrerTablaHash(Hashtable<Integer, String> tablaNombres) {
		Enumeration<String> enumeration=tablaNombres.elements();
		Enumeration<Integer> enumerationKeys=tablaNombres.keys();
		
		while(enumeration.hasMoreElements()) {
			System.out.println("Valor: "+ enumerationKeys.nextElement()+" .. "+enumeration.nextElement());
		}
		
		
	}

}
