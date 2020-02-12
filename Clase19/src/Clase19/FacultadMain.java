package Clase19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FacultadMain {

	List<Estudiantes>ListaEstudiantes = new ArrayList <Estudiantes>();
	List<Empleados>listaProfesores = new ArrayList <Empleados>();
	List<Empleados>listaPersonalServicio=new ArrayList<Empleados>();
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		//Menu del programa y lector de variables.
		
		
		Scanner lector = new Scanner (System.in);
		System.out.println("Menu");
		System.out.println(" ");
		System.out.println("1. Crear");
		System.out.println("2. Mostrar");
		System.out.println("3. Modificar");
		System.out.println("4. Salir");
		System.out.println(" ");

		System.out.print("Elija su opcion: ");
		int opcion = lector.nextInt(); //se lee la opcion ingresada

		switch (opcion) {
		case 1: {
			System.out.println("1. Estudiante");
			System.out.println("2. Profesor");
			System.out.println("3. Personal de servicio");
			System.out.println("4. Volver");
			
			System.out.print("Elija su opcion: ");
			int opcionCrear = lector.nextInt(); //se lee la opcion ingresada
			
			switch (opcionCrear) {
			case 1: {
				System.out.println("Nombre Estudiante");
				String nombreEstudiante = lector.next(); //se lee la opcion ingresada

				System.out.println("Apellido Estudiante");
				String apellidoEstudiante = lector.next(); //se lee la opcion ingresada
				
				System.out.println("RUT Estudiante");
				String rutEstudiante = lector.next(); //se lee la opcion ingresada
				
				System.out.println("Estado Civil del Estudiante");
				String estadoCivilEstudiante = lector.next(); //se lee la opcion ingresada
				
				System.out.println("Curso del Estudiante");
				String cursoEstudiante = lector.next(); //se lee la opcion ingresada
				
				Estudiantes estudiante1 = new Estudiantes (nombreEstudiante, apellidoEstudiante, rutEstudiante, estadoCivilEstudiante, cursoEstudiante);
			}
			}
		} 
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		
	}

}
