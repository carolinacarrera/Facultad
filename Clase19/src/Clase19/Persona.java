package Clase19;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String run;
	private String estadoCivil;

	public Persona(String nombre, String apellidos, String run, String estadoCivil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.run = run;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", run=" + run + ", estadoCivil="
				+ estadoCivil + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

		
}
