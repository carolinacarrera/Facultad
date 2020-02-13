package Clase19;

public class Estudiantes extends Persona{

	private String curso;

	public Estudiantes(String nombre, String apellidos, String run, String estadoCivil, String curso) {
		super(nombre, apellidos, run, estadoCivil);
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiantes ["+ super.toString() + "curso=" + curso+"]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Curso: " + getCurso());
	}
}
