package ejercicioHashTableyHashMap;

import javax.swing.JOptionPane;

public class TransitionEvaluation {
	
		
		
		public static void main(String[]args) {
			/*
			 * Haga un sistema que solicite:
			 * -nombre
			 * -edad de n estudiantes e imprima:
			 * -Nombre de todos los estudiantes registrados
			 * -Lista de todos los estudiantes con sus edades
			 * -suma todas las edades 
			 * -promedio de edades de todos los estudiantes
			 * -Indique cuantos estudiantes son mayores de 18 años mostrando nombre y edad
			 * -Permita consultar un estudiante por nombre
			 * 
			 * 
			 */
			
			OperacionesRegistroEstudiantes iniciar=new OperacionesRegistroEstudiantes();
			iniciar.Operaciones();
			
			
			  int codMenuPpal=0;
		        //Menu de opciones segun lo deseado por el usuario
			  
				do {
					
					String menu="Menu del sistema\n\n";
					menu+="1. Agregar estudiante \n";
					menu+="2. Lista de nombres de estudiantes\n";
					menu+="3. Mostras todos los datos de estudiantes\n";
					menu+="4. Suma de todas las edades\n";
					menu+="5. Promedio de edad de los estudiantes\n";
					menu+="6. Consulta de mayoria de edad de los estudiantes\n";
					menu+="7. Consulta de estudiantes por nombre\n";
					menu+="8. Salir\n\n";
					menu+="Por favor Seleccione una opcion \n";
				
					codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));
					
					switch (codMenuPpal) {
					case 1:
						
						JOptionPane.showMessageDialog(null,"Agregar estudiante" );
						iniciar.RegistroEstudiante();
					
						break;
					case 2:
						
						JOptionPane.showMessageDialog(null,"Lista de nombres de estudiantes" );
						iniciar.ListaNombres();
						
						break;
					case 3:
						
						
						JOptionPane.showMessageDialog(null,"Mostras todos los datos de estudiantes" );
						iniciar.MostrarEstudiantes();
					
					
						
						break;
					case 4:
						
						JOptionPane.showMessageDialog(null,"Suma de todas las edades" );
						iniciar.SumaEdadesEstudiante();
						
						

						break;
					case 5:
						
						JOptionPane.showMessageDialog(null,"Promedio de edad de los estudiantes" );
						iniciar.promedioEdadEstudiante();
						
						
						break;
					case 6:
						
						JOptionPane.showMessageDialog(null,"Consulta de mayoria de edad de los estudiantes" );
						iniciar.mayorEdadEstudiante();
						 
						break;
					case 7:
						
						JOptionPane.showMessageDialog(null,"Consulta de estudiantes por nombre" );
						iniciar.listadoEstudianteN();
						 
						break;
					case 8:
	
							JOptionPane.showMessageDialog(null,"Salir" );
	
	 
						break;
					
					default:
						
						JOptionPane.showMessageDialog(null,"No corresponde a un "
								+ "codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE );
						break;
							
					}
					
				}while(codMenuPpal !=8);
				
		        
		       
		    }
			
		


}
