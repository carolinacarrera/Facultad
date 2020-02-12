package Clase19;

public class Empleados extends Persona {

	private int anioIncorporacion;
	private String despacho;
	private String tipoEmpleado;
	private String departamentoTrabajo; //Para profesores
	private String seccionAsignada; //Para personal de servicio

	public Empleados(String nombre, String apellidos, String run, String estadoCivil, int anioIncorporacion,
			String despacho, String tipoEmpleado, String departamentoTrabajo) {
		super(nombre, apellidos, run, estadoCivil);
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
		this.tipoEmpleado = tipoEmpleado;
		this.departamentoTrabajo = departamentoTrabajo;
	}
	
	public Empleados(String nombre, String apellidos, String run, int anioIncorporacion, String estadoCivil, 
			String despacho, String tipoEmpleado, String seccionAsignada) {
		super(nombre, apellidos, run, estadoCivil);
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
		this.tipoEmpleado = tipoEmpleado;
		this.seccionAsignada = seccionAsignada;
	}

	@Override
	public String toString() {
		return "Empleados [anioIncorporacion=" + anioIncorporacion + ", despacho=" + despacho + ", tipoEmpleado="
				+ tipoEmpleado + ", departamentoTrabajo=" + departamentoTrabajo + ", seccionAsignada=" + seccionAsignada
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


	public String getTipoEmpleado() {
		return tipoEmpleado;
	}


	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
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
		System.out.println("A�o Incorporaci�n: " + getAnioIncorporacion() + "\n Despacho: " + getDespacho() + "\n Tipo Empleado" + getTipoEmpleado() + "\n Departamento Trabajo: " + getDepartamentoTrabajo() + "\n Secci�n Asignada" + getSeccionAsignada());
	}
	
}