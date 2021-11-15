package sesion3;

public class Cuenta {

    private static final double MIN_FONDOS = -500;
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean ingreso(double cantidad) {
        saldo += cantidad;
        return true;
    }

    public boolean reintegro(double cantidad) {
        if(saldo-cantidad < MIN_FONDOS){
            return false;
        }else{
            saldo -= cantidad;
            return true;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
}
