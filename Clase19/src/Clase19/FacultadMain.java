package Clase19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FacultadMain {

	static List<Estudiantes>ListaEstudiantes = new ArrayList <Estudiantes>();
	static List<Empleados>listaProfesores = new ArrayList <Empleados>();
	static List<Empleados>listaPersonalServicio=new ArrayList<Empleados>();


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
				ListaEstudiantes.add(estudiante1);//se guarda objeto en lista estudiante
				break;
			}

			case 2: {

				System.out.println("Nombre Profesor");
				String nombreProfesor = lector.next(); //se lee la opcion ingresada
				
				System.out.println("Apellido Profesor");
				String apellidoProfesor = lector.next(); //se lee la opcion ingresada

				System.out.println("RUT Profesor");
				String rutProfesor = lector.next(); //se lee la opcion ingresada

				System.out.println("Estado Civil del Profesor");
				String estadoCivilProfesor = lector.next(); //se lee la opcion ingresada

				System.out.println("Departamento");
				String Departamento = lector.next(); //se lee la opcion ingresada

				System.out.println("Anos de antiguedad: ");
				int AniosAntiguedad = lector.nextInt();

				System.out.println("Despacho: ");
				String Despacho = lector.next();

				Empleados profesor1 = new Empleados(nombreProfesor, apellidoProfesor, rutProfesor,estadoCivilProfesor, AniosAntiguedad, Despacho, Departamento);
				listaProfesores.add(profesor1); 
				break;
			}

			case 3: {

				System.out.println("Nombre Personal Servicio: ");
				String nombrePServicio = lector.next(); //se lee la opcion ingresada

				System.out.println("Apellido Personal Servicio: ");
				String apellidoPServicio = lector.next(); //se lee la opcion ingresada

				System.out.println("RUT Personal Servicio");
				String rutPServicio = lector.next(); //se lee la opcion ingresada

				System.out.println("Estado Civil Personal Servicio: ");
				String estadoPServicio = lector.next(); //se lee la opcion ingresada

				System.out.println("Despacho: ");
				String DespachoPServicio = lector.next(); //se lee la opcion ingresada

				System.out.println("Anos de antiguedad: ");
				int AniosAntiguedad = lector.nextInt();

				System.out.println("Seccion Asignada: ");
				String SeccionAsignada= lector.next();

				Empleados Pservicio1 = new Empleados(nombrePServicio, apellidoPServicio, rutPServicio,  AniosAntiguedad, estadoPServicio, DespachoPServicio, SeccionAsignada);
				listaPersonalServicio.add(Pservicio1);
				break;
			
			}
			}
		}
		

	  case 2:{
			System.out.println("1. Mostrar datos de estudiante");
			System.out.println("2. Mostrar datos de profesor");
			System.out.println("3. Mostrar datos de personal de servicio");
			
			}
		}
			
		






		
}


}

