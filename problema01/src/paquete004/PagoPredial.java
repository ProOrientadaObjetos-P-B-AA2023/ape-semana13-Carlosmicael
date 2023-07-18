
package paquete004;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.Pago;
public class PagoPredial extends Persona implements Pago {
    public PagoPredial() {}
    public PagoPredial(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad) {
        super(nombre, apellido, edad, cedula, nombreCiudad, propiedad);
    }
    public double calcularTotalPagar(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        double pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
        return pago;
    }
}
