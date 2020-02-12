package Clase19;

public class Empleados extends Persona {

	private int anioIncorporacion;
	private String despacho;
	private String departamentoTrabajo; //Para profesores
	private String seccionAsignada; //Para personal de servicio

	public Empleados(String nombre, String apellidos, String run, String estadoCivil, int anioIncorporacion,
			String despacho, String departamentoTrabajo) {
		super(nombre, apellidos, run, estadoCivil);
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
		this.departamentoTrabajo = departamentoTrabajo;
	}
	
	public Empleados(String nombre, String apellidos, String run, int anioIncorporacion, String estadoCivil, 
			String despacho, String seccionAsignada) {
		super(nombre, apellidos, run, estadoCivil);
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
		this.seccionAsignada = seccionAsignada;
	}

	@Override
	public String toString() {
		return "Empleados [anioIncorporacion=" + anioIncorporacion + ", despacho=" + despacho + ", tipoEmpleado="
				+ ", departamentoTrabajo=" + departamentoTrabajo + ", seccionAsignada=" + seccionAsignada
				+ "]";
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

	public String getDepartamentoTrabajo() {
		return departamentoTrabajo;
	}

	public void setDepartamentoTrabajo(String departamentoTrabajo) {
		this.departamentoTrabajo = departamentoTrabajo;
	}


	public String getSeccionAsignada() {
		return seccionAsignada;
	}

	public void setSeccionAsignada(String seccionAsignada) {
		this.seccionAsignada = seccionAsignada;
	}
	
	public void imprimir() {
		//System.out.println("Nombre: " + getNombre() + "\n apellidos: " + getApellidos() + "\n Run: " + getRun() + "\n Estado Civil: " + getEstadoCivil());
		super.imprimir();
		System.out.println("Año Incorporación: " + getAnioIncorporacion() + "\n Despacho: " + getDespacho() + "\n Departamento Trabajo: " + getDepartamentoTrabajo() + "\n Sección Asignada" + getSeccionAsignada());
	}
	
}