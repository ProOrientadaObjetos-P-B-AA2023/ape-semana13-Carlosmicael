package paquete005;
import paquete001.MiPersona;
import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Propiedad
        Propiedad propiedad = new Propiedad(250000);
        // Crear una instancia de Persona (reemplaza con la subclase correspondiente)
        Persona persona = new MiPersona("Juan", "Pérez", 35, "1234567890", "LOJA", propiedad);
        // Crear una instancia de BilleteraPagos asociada a la persona
        BilleteraPagos billeteraPagos = new BilleteraPagos(persona);
        // Realizar los pagos
        billeteraPagos.realizarPagos();
        // Mostrar el reporte
        System.out.println(billeteraPagos.toString());
    }
}
