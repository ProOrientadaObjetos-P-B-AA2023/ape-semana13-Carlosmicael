
package paquete003;
import paquete001.Persona;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;
public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public String mes;
    public Pago aguaCasa;
    public Pago aguaComercio;
    public Pago luzCasa;
    public Pago luzComercio;
    public Pago predialCasa1;
    public Pago predialCasa2;
    public Pago telefonoCasa;
    public Pago telefonoFinca;
    public BilleteraPagos(Persona persona) {
        this.persona = persona;
        this.gastoPagos = 0.0;
        this.mes = "Enero";
        this.aguaCasa = new PagoAguaPotable("comercial");
        this.aguaComercio = new PagoAguaPotable("residencial");
        this.luzCasa = new PagoLuzElectrica();
        this.luzComercio = new PagoLuzElectrica();
        this.predialCasa1 = new PagoPredial();
        this.predialCasa2 = new PagoPredial();
        this.telefonoCasa = new PagoTelefonoConvencional();
        this.telefonoFinca = new PagoTelefonoConvencional();
    }
    public void realizarPagos() {
        double pagoAguaCasa = aguaCasa.calcularTotalPagar();
        double pagoAguaComercio = aguaComercio.calcularTotalPagar();
        double pagoLuzCasa = luzCasa.calcularTotalPagar();
        double pagoLuzComercio = luzComercio.calcularTotalPagar();
        double pagoPredialCasa1 = predialCasa1.calcularTotalPagar();
        double pagoPredialCasa2 = predialCasa2.calcularTotalPagar();
        double pagoTelefonoCasa = telefonoCasa.calcularTotalPagar();
        double pagoTelefonoFinca = telefonoFinca.calcularTotalPagar();
        gastoPagos = pagoAguaCasa + pagoAguaComercio + pagoLuzCasa + pagoLuzComercio +
                pagoPredialCasa1 + pagoPredialCasa2 + pagoTelefonoCasa + pagoTelefonoFinca;
    }
    public String toString() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Billetera de Pagos\n");
        reporte.append("Persona: ").append(persona.getNombre()).append(" ").append(persona.getApellido()).append("\n");
        reporte.append("Ciudad: ").append(persona.getNombreCiudad()).append("\n");
        reporte.append("Mes: ").append(mes).append("\n");
        reporte.append("Gastos totales: $").append(gastoPagos).append("\n");
        return reporte.toString();
    }
    
}
