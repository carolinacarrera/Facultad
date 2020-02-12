package Clase19;

public class Empleados extends Persona{
	
	private int anioIncorporacion;
	private String despacho;
	
	public Empleados(String nombre, String apellidos, String run, String estadoCivil, int anioIncorporacion, String despacho) {
		super(nombre, apellidos, run, estadoCivil);
		// TODO Auto-generated constructor stub
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
	}

	public int getAnioIncorporacion() {
		return anioIncorporacion;
	}

	public void setAnioIncorporacion(int anioIncorporacion) {
		this.anioIncorporacion = anioIncorporacion;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	

}
