
package paquete004;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.Pago;
public class PagoAguaPotable extends Persona implements Pago {
    public String tipo;
    public PagoAguaPotable() {}
    public PagoAguaPotable(String tipo) {
        this.tipo = tipo;
    }
    public PagoAguaPotable(String nombre, String apellido, int edad, String cedula, String nombreCiudad, Propiedad propiedad, String tipo) {
        super(nombre, apellido, edad, cedula, nombreCiudad, propiedad);
        this.tipo = tipo;
    }
    public double calcularTotalPagar(){
        double pago = 0;
        if(tipo.equals("comercial")){
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
        return pago;
    }
}
