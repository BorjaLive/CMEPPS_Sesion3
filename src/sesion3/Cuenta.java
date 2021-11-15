package sesion3;

public class Cuenta {

    private static final double MIN_FONDOS = -500;
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = 0;
    }

    public boolean ingreso(double cantidad) {
        return false;
    }

    public boolean reintegro(double cantidad) {
        return false;
    }
    
    public double getSaldo(){
        return 0;
    }
}
