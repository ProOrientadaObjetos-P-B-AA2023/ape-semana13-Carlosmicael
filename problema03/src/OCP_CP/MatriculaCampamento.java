package OCP_CP;
public class MatriculaCampamento implements Matricula {
    private double tarifa;
    public MatriculaCampamento() {
        establecerTarifa();
    }
    private void establecerTarifa() {
        tarifa = 100.2 + 30.2 + 90.2;
    }
    @Override
    public double obtenerTarifa() {
        return tarifa;
    }
}
