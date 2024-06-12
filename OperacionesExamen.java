package ejercicioHashTableyHashMap;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;
public class OperacionesExamen {
		HashMap<String, Integer> mapaInventario;
		
		
		public void proceso() {
			mapaInventario= new HashMap<>();
		}
		
		
		public void RegistrarProductos() {
			System.out.println("<<< Registro de Productos >>>");
			int contador= 0,cant=0;
			String nombre="";
			
			for(int i=0; i<contador ; i++) {
				nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
				cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad para el producto"));
				mapaInventario.put(nombre, cant);
				
				
			}
			System.out.println("<<< Registro exitoso!! >>>");
		}
		
		
		public void consultarProducto() {
			System.out.println("<<< Consultar Productos >>>");
			String nombre="";
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto a consultar");
			
			if(mapaInventario.containsKey(nombre)) {
				System.out.println("<<< El producto existe en el inventario >>>");
				System.out.println("El producto: "+nombre+" unidades en existencia: "+mapaInventario.get(nombre));
			}else {
				System.out.println("<<< El producto no existe en el inventario >>>");
			}
			
		}
		
		public void ActualizarUnidades() {
			System.out.println("<<< Actualizar Unidades >>>");
			String nombre="";
			int cant=0;
			
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
			if(mapaInventario.containsKey(nombre)) {
				System.out.println("<<< El producto existente >>>");
				cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la nueva cantidad"));
				mapaInventario.replace(nombre, cant);
				
			}else {
				System.out.println("<<< El producto no existe en el inventario,\n"
						+ "Por favor realice el registro primeramente >>>");
			}
			
			
		}
		
		
		public void consultarProductoYUnidades() {
			System.out.println("<<< Mostrar Inventario >>>");
			Iterator<String> iterator=mapaInventario.keySet().iterator();
			
			while(iterator.hasNext()) {
				String llave= iterator.next();
				System.out.println("Producto: "+llave+" Unidades: "+mapaInventario.get(llave));
			}
		}
		
		public void BorrarUnidades() {
			System.out.println("<<< Borrar Unidades del producto >>>");
			String nombre="";
			int cant=0;
			
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del producto");
			if(mapaInventario.containsKey(nombre)) {
				System.out.println("<<< El producto existente >>>");
				mapaInventario.remove(nombre);
				
			}else {
				System.out.println("<<< El producto no existe en el inventario >>>");
						
			}
			
			
		}
		
		
		
	

}
