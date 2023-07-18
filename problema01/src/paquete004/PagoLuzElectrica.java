
package paquete004;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.Pago;

public class PagoLuzElectrica extends Persona implements Pago {
    public PagoLuzElectrica() {}
    public PagoLuzElectrica(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad) {
        super(nombre, apellido, edad, cedula, nombreCiudad, propiedad);
    }
    public double calcularTotalPagar() {
        double pago = 0;
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
        return pago;
    }
}
