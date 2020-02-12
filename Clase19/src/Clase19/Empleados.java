package Clase19;

public class Empleados extends Persona {

	private int anioIncorporacion;
	private String despacho;
	private String tipoEmpleado;
	private String departamentoTrabajo; //Para profesores
	private String seccionAsignada; //Para personal de servicio

	public Empleados(String nombre, String apellidos, String run, String estadoCivil, int anioIncorporacion,
			String despacho, String tipoEmpleado, String departamentoTrabajo, String seccionAsignada) {
		super(nombre, apellidos, run, estadoCivil);
		this.anioIncorporacion = anioIncorporacion;
		this.despacho = despacho;
		this.tipoEmpleado = tipoEmpleado;
		this.departamentoTrabajo = departamentoTrabajo;
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

}