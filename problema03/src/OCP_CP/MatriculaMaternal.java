package OCP_Principio;
public class MatriculaMaternal implements Matricula {
    private double tarifa;
    public void establecerTarifa(){
        tarifa = 50.2 + 40.2 + 80.2;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}