package SRP_CP;
import java.util.ArrayList;
import paquete01.Televisor;
public class Principal {
    public static void main(String[] args) {
        Televisor t1 = new Televisor();
        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);
        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUNG-21 pulgadas");
        t2.establecerPrecio(1300.2);
        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);
        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        double totalPrecio = calcularPrecioTotal(tvs);
        System.out.printf("%.2f\n", totalPrecio);
        String marcasVendidas = obtenerMarcasVendidas(tvs);
        System.out.printf("%s\n", marcasVendidas);
    }
    public static double calcularPrecioTotal(ArrayList<Televisor> televisores) {
        double total = 0;
        for (Televisor tv : televisores) {
            total += tv.obtenerPrecio();
        }
        return total;
    }
    public static String obtenerMarcasVendidas(ArrayList<Televisor> televisores) {
        StringBuilder marcas = new StringBuilder();
        for (Televisor tv : televisores) {
            marcas.append(tv.obtenerMarca()).append("\n");
        }
        return marcas.toString();
    }
}

