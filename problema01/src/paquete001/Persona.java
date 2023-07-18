package paquete001;
import paquete002.Propiedad;
abstract public class Persona {
    public String nombre;
    public String apellido;
    protected int edad;
    protected String cedula;
    String nombreCiudad;
    protected Propiedad propiedad;
    protected double TotalPagar;
    public Persona() {}
    public Persona(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.nombreCiudad = nombreCiudad;
        this.propiedad = propiedad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public Propiedad getPropiedad() {
        return propiedad;
    }
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }
    public abstract double calcularTotalPagar();
}
