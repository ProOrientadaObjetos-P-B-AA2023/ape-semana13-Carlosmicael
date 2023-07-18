
package paquete004;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.Pago;
public class PagoTelefonoConvencional extends Persona implements Pago {
    public PagoTelefonoConvencional() {}
    public PagoTelefonoConvencional(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad) {
        super(nombre, apellido, edad, cedula, nombreCiudad, propiedad);
    }
    public double calcularTotalPagar(){
        double tarifa = 6.20;
        double minutosConsumidos = 100;
        double costoMinuto = 0.2;
        double pago = tarifa + (minutosConsumidos * costoMinuto);
        return pago;
    }
}
