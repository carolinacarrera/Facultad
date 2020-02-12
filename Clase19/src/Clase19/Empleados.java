package Clase19;

public class Empleados extends Persona {
//empleados
String TipoDeEmpleado;
//Profesores
String DepartamentoTrabajo;
//Personal de Servicio
String SeccionAsignada;

    public Empleados(String TipoDeEmpleado, String DepartamentoTrabajo, String SeccionAsignada, String nombre, String apellidos, String rut, String Estadocivil) {
        super(nombre, apellidos, rut, Estadocivil);
        this.TipoDeEmpleado = TipoDeEmpleado;
        this.DepartamentoTrabajo = DepartamentoTrabajo;
        this.SeccionAsignada = SeccionAsignada;
    }

    public String getTipoDeEmpleado() {
        return TipoDeEmpleado;
    }

    public void setTipoDeEmpleado(String TipoDeEmpleado) {
        this.TipoDeEmpleado = TipoDeEmpleado;
    }

    public String getDepartamentoTrabajo() {
        return DepartamentoTrabajo;
    }

    public void setDepartamentoTrabajo(String DepartamentoTrabajo) {
        this.DepartamentoTrabajo = DepartamentoTrabajo;
    }

    public String getSeccionAsignada() {
        return SeccionAsignada;
    }

    public void setSeccionAsignada(String SeccionAsignada) {
        this.SeccionAsignada = SeccionAsignada;
    }

    @Override
    public String toString() {
        return "Empleados{" + "TipoDeEmpleado=" + TipoDeEmpleado + ", DepartamentoTrabajo=" + DepartamentoTrabajo + ", SeccionAsignada=" + SeccionAsignada + '}';
    }
    
    
}
