package paquete005;
import paquete001.MiPersona;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
public class Principal {
    public static void main(String[] args) {
        Propiedad propiedad = new Propiedad(250000);
        Persona persona = new MiPersona("Juan", "Pérez", 35, "1234567890", "LOJA", propiedad);
        BilleteraPagos billeteraPagos = new BilleteraPagos(persona);
        billeteraPagos.realizarPagos();
        System.out.println(billeteraPagos.toString());
    }
}
