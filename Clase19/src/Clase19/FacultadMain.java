package Clase19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FacultadMain {

	static List<Estudiantes>ListaEstudiantes = new ArrayList <Estudiantes>();
	static List<Empleados>ListaProfesores = new ArrayList <Empleados>();
	static List<Empleados>listaPersonalServicio=new ArrayList<Empleados>();

	public static void modificar() {
		Scanner lector = new Scanner (System.in);
		System.out.println("INGRESE OPCION A MODIFICAR");
		System.out.println("");
		System.out.println("1.- Estudiantes");
		System.out.println("2.- Profesor");
		System.out.println("3.- Personal de Servicio");

		int opcion = lector.nextInt();

		switch (opcion) {
		case 1:
			
			System.out.println("Ingrese RUN de estudiante a modificar: ");
			String run = lector.next();
			
			for (Estudiantes est:ListaEstudiantes) {
				if (est.getRun().equals(run)){
					System.out.println("Modificando datos de " + est.getNombre() + " " + est.getApellidos());
					System.out.println("nuevo Estado civil: ");
					String estcivil = lector.next();
					est.setEstadoCivil(estcivil);
					
					System.out.println("nuevo Curso: ");
					String curso = lector.next();
					est.setCurso(curso);
				}
			}
			
			break; 

		case 2:

			break;	

		case 3:

			break;

		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}

	}







	public static void mostrar() {

		Scanner lector = new Scanner (System.in);
		System.out.println("INGRESE OPCION A MOSTRAR");
		System.out.println("");
		System.out.println("1.- Estudiantes");
		System.out.println("2.- Profesor");
		System.out.println("3.- Personal de Servicio");

		int opcion = lector.nextInt();

		switch (opcion) {
		case 1:
			for (Estudiantes mostrarEstudiantes: ListaEstudiantes) {
				System.out.println(mostrarEstudiantes);
			}
			break; 

		case 2:
			for (Empleados mostrarprofes: ListaProfesores) {
				System.out.println(mostrarprofes);

			}
			break;	

		case 3:
			for (Empleados mostrarPservicio: listaPersonalServicio) {
				System.out.println(mostrarPservicio);
			}
			break;

		default:
			break;
		}


	}



	public static void agregar() {
		System.out.println("INGRESE OPCION A INGRESAR");
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

	private static void salir() {
		System.out.println("Chao pescao :) ");
	} 
	
	public static void main(String[] args) {
		//Menu del programa y lector de variables.

		Scanner lector = new Scanner (System.in);

		int opcionMenu1;
		do {


			System.out.println("Menu");
			System.out.println(" ");
			System.out.println("1. Agregar");
			System.out.println("2. Mostrar");
			System.out.println("3. Modificar");
			System.out.println("4. Salir");
			System.out.println(" ");

			System.out.print("Elija su opcion: ");
			opcionMenu1 = lector.nextInt(); //se lee la opcion ingresada

			switch (opcionMenu1) {


			case 1:
				agregar();
				break;
			case 2:
				mostrar();
				break;
			case 3:
				modificar();
				break;
			case 4:
				salir();
				break;
			default:
				System.out.println("Ingrese una opcion valida");
				break;

			}
		}while (opcionMenu1 != 4);	

	}

}//main

