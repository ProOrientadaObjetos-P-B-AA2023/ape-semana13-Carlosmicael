package SRP_Principio;
import java.util.ArrayList;
import paquete01.Televisor;
public class VentasTvs {
    private ArrayList<Televisor> televisores;

    public VentasTvs(ArrayList<Televisor> t){
        televisores = t;
    }

    public double calcularPrecioTotal(){
        double total = 0;
        for (Televisor tv : televisores) {
            total += tv.obtenerPrecio();
        }
        return total;
    }

    public String obtenerMarcasVendidas(){
        String marcas = "";
        for (Televisor tv : televisores) {
            marcas += tv.obtenerMarca() + "\n";
        }
        return marcas;
    }
}
