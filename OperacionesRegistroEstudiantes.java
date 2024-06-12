package ejercicioHashTableyHashMap;

import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class OperacionesRegistroEstudiantes {
	HashMap<String, Integer> mapaEstudiante;
	
	public void Operaciones() {
		
		 mapaEstudiante= new HashMap<>();
		
		
	}
	
	
	public void RegistroEstudiante() {
		System.out.println("<<< Registro de Estudiante >>>");
		
		int contador=0,edad=0;
		String nombre="";
		contador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a registrar"));
		
		for(int i=0; i<contador ; i++) {
			
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
			edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
			
			mapaEstudiante.put(nombre, edad);
			
			
		}
		System.out.println("<<< Registro Existoso!! >>>");
		
		
	}
	
	public void ListaNombres() {
		System.out.println("<<< Lista de nombres >>>");
		
		System.out.println(mapaEstudiante.keySet());
		
	}
	
	public void MostrarEstudiantes() {
		System.out.println("<<< Lista de Registros de Estudiantes >>>");
		
		Iterator<String> iterator=mapaEstudiante.keySet().iterator();
		
		while(iterator.hasNext()) {
			String llave= iterator.next();
			System.out.println("Estudiante: "+llave+" Edad: "+mapaEstudiante.get(llave));
		}
		
	}
	
	public void SumaEdadesEstudiante() {
		System.out.println("<<< Suma de edades de estudiante >>>");
		int edades=0,suma=0;
		
		Iterator<String> iterator=mapaEstudiante.keySet().iterator();
		
		while(iterator.hasNext()) {
			String llave= iterator.next();
			//System.out.println(llave+" .. "+mapaEstudiante.get(llave));
			edades=mapaEstudiante.get(llave);
			suma+=edades;
		}
		System.out.println("La suma total de las edades de los estudiantes es "+suma);
		
		
	}
	
	public void promedioEdadEstudiante() {
		System.out.println("<<< Promedio de edad de  los estudiantes >>>");
		int edades=0,suma=0,promedio=0;
		
		Iterator<String> iterator=mapaEstudiante.keySet().iterator();
		
		while(iterator.hasNext()) {
			String llave= iterator.next();
			//System.out.println(llave+" .. "+mapaEstudiante.get(llave));
			edades=mapaEstudiante.get(llave);
			suma+=edades;
			promedio=suma / mapaEstudiante.size();
		}
		System.out.println("El promedio de edades de los estudiantes es "+ promedio);
	}
	
	
	
	public void mayorEdadEstudiante() {
		System.out.println("<<< Consulta de mayoria de edad >>>");
		int edad=0;
		Iterator<String> iterator=mapaEstudiante.keySet().iterator();
		
		while(iterator.hasNext()) {
			String llave= iterator.next();
			//System.out.println(llave+" .. "+mapaEstudiante.get(llave));
			edad=mapaEstudiante.get(llave);
			if(edad>=18) {
				System.out.println("El estudiante es mayor de edad");
				System.out.println(llave+" Tiene "+mapaEstudiante.get(llave));
			}else {
				System.out.println("Estudiante menor de edad");
				System.out.println(llave+" Tiene "+mapaEstudiante.get(llave));
			}
		
		}
	
	}


	public void listadoEstudianteN() {
		System.out.println("<<< Consulta de estudiante por nombre >>>");
		String nombre="";
		nombre=JOptionPane.showInputDialog("¿Ingrese el nombre del estudiante que desea consultar?");
		
		if(mapaEstudiante.containsKey(nombre)) {
			System.out.println("<<< El estudiante existe en el registro >>>");
			System.out.println(nombre+" tiene "+mapaEstudiante.get(nombre));
		}else {
			System.out.println("<<< El estudiante  no se encuentra en los registros >>>");
		}
		
	}


	
	
	
}
