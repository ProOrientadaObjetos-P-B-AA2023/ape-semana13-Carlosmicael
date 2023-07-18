package paquete001;
import paquete001.Persona;
import paquete002.Propiedad;
public class MiPersona extends Persona {
    public MiPersona(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad) {
        super(nombre, apellido, edad, cedula, nombreCiudad, propiedad);
    }
    @Override
    public double calcularTotalPagar() {
        return 0;
    }
}
