package OCP_CP;
public class TipoMatricula {
    private double promedioMatriculas;
    private Matricula[] matriculas;

    public TipoMatricula(Matricula[] matriculas) {
        this.matriculas = matriculas;
        establecerPromedioTarifas();
    }
    private void establecerPromedioTarifas() {
        double totalTarifas = 0;
        for (Matricula matricula : matriculas) {
            totalTarifas += matricula.obtenerTarifa();
        }
        promedioMatriculas = totalTarifas / matriculas.length;
    }
    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
}
