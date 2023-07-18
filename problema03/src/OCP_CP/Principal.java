package OCP_CP;
public class Principal {
    public static void main(String[] args) {
        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcolegio = new MatriculaColegio();
        Matricula[] matriculas = { mcamp, mcolegio };
        TipoMatricula tipos = new TipoMatricula(matriculas);
        System.out.printf("Promedio de tarifas: %.2f\n", tipos.obtenerPromedioTarifas());
    }
}
