package OCP_Principio;
public class MatriculaJardin implements Matricula {
    private double tarifa;
    public void establecerTarifa(){
        tarifa = 50.2 + 140.2 + 40;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
