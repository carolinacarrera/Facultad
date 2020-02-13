package Clase19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FacultadMain {

	static List<Estudiantes>ListaEstudiantes = new ArrayList <Estudiantes>();
	static List<Empleados>ListaProfesores = new ArrayList <Empleados>();
	static List<Empleados>listaPersonalServicio=new ArrayList<Empleados>();
	static int opcionMenu1 = 100;
	
	public static void mostrar() {
	
	Scanner lector = new Scanner (System.in);
	int opcion = lector.nextInt();

	System.out.println("Ingrese opcion a mostar");
	System.out.println("");
	System.out.println("1.- Estudiantes");
	System.out.println("2.- Profesor");
	System.out.println("3.- Personal de Servicio");
	
    switch (opcion) {
	case '1':
		
		System.out.println(ListaEstudiantes);
		break; 
	
	case '2':
		
		System.out.println(ListaProfesores);
		break;	
	case '3':
		
		System.out.println(listaPersonalServicio);
		break;
		
	default:
		break;
	}
	
		
	}
	
	
	
	public static void agregar() {
		
		System.out.println("1. Estudiante");
		System.out.println("2. Profesor");
		System.out.println("3. Personal de servicio");
		System.out.println("4. Volver");
		
		Scanner lector = new Scanner (System.in);
		int opcion = lector.nextInt(); //se lee la opcion ingresada

		switch (opcion) {

		case 1: 

			System.out.println("Nombre Estudiante");
			String nombre = lector.next(); //se lee la opcion ingresada

			System.out.println("Apellido Estudiante");
			String apellido= lector.next(); //se lee la opcion ingresada

			System.out.println("RUT Estudiante");
			String rut = lector.next(); //se lee la opcion ingresada

			System.out.println("Estado Civil del Estudiante");
			String estadoCivil = lector.next(); //se lee la opcion ingresada

			System.out.println("Curso del Estudiante");
			String cursoEstudiante = lector.next(); //se lee la opcion ingresada

			Estudiantes estudiante1 = new Estudiantes (nombre, apellido, rut, estadoCivil, cursoEstudiante);
			ListaEstudiantes.add(estudiante1);//se guarda objeto en lista estudiante
			break;


		case 2: 

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
			int AniosAntiguedadProfe = lector.nextInt();

			System.out.println("Despacho: ");
			String Despacho = lector.next();

			Empleados profesor1 = new Empleados(nombreProfesor, apellidoProfesor, rutProfesor,estadoCivilProfesor, AniosAntiguedadProfe, Despacho, Departamento,null);
			ListaProfesores.add(profesor1); 
			break;


		case 3: 

			System.out.println("Nombre Personal Servicio: ");
			String nombrePservicio = lector.next(); //se lee la opcion ingresada

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

			Empleados Pservicio1 = new Empleados(nombrePservicio, apellidoPServicio, rutPServicio,  estadoPServicio, AniosAntiguedad, DespachoPServicio, null,SeccionAsignada);
			listaPersonalServicio.add(Pservicio1);
			break;

		default:

			System.out.println("Opcion no valida");
		
		}//cierra Switch
	}//cierra metodo

public static void main(String[] args) {
		//Menu del programa y lector de variables.

	do {
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Menu");
		System.out.println(" ");
		System.out.println("1. Agregar");
		System.out.println("2. Mostrar");
		System.out.println("3. Modificar");
		System.out.println("4. Salir");
		System.out.println(" ");

		System.out.print("Elija su opcion: ");
		int opcionMenu1 = lector.nextInt(); //se lee la opcion ingresada
		
		switch (opcionMenu1) {
		
		
		case 1:
			agregar();
			
			break;

			
		case 2:
			mostrar();
			
			break;
			
			/*break;
		case '3':
			
			modificar();
			
			break;*/
	
		default:
			break;
		
		
	}
	}while (opcionMenu1 == 4);	

	}

}//main

