package EJ_2;

/*
Falta
Establecer tipo de interés,
Ingresar dinero,
 Retirar dinero,
  Saldo actual o Abonar intereses.
  Asegúrese que el monto a retirar no exceda el saldo de Cuenta.
Si lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique
 ''El monto a retirar excede el saldo de la cuenta.”
 */

public class CuentaBancaria {

    private double saldo;
    private double tipoInteres;

    public CuentaBancaria(double saldo, double tipoInteres) {
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void ingresarDinero(double monto){
        saldo += monto;
    }

    public void retirarDinero(double monto){
        if(saldo < monto ){
            System.out.println("El monto a retirar excede el saldo de la cuenta.");
        }else{
            saldo -= monto;
        }
    }

    public double MontoInteres(){
        return ((saldo * tipoInteres) / 100);
    }

    public void abonarIntereses(){
        saldo = saldo + MontoInteres();
    }
}
