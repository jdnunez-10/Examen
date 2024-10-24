package hn.unah.poo.dtos;

import hn.unah.poo.interfaces.IMetodoPago;

public class PagoPayPal implements IMetodoPago{

    private double monto;
    private double saldo;
    private double saldoFinal;

    

    private PagoPayPal(double monto, double saldo) {
        this.monto = monto;
        this.saldo = saldo;
    
    }


    public double getMonto() {
        return monto;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public double getSaldoFinal() {
        return saldoFinal;
    }


    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }


    @Override
    public double procesarPago(double monto) {
      
       if (monto < saldo) {

           System.out.println("\nConectando con su cuenta de PayPal...");
           System.out.println("\nRealizando pago...");
           System.out.println("\n...Pago realizado");
           
        }else{
            System.out.println("\nNo se pudo realizar la transaccion");
            System.out.println("\nFondos insuficientes");
        }
        saldoFinal = monto - saldo;
        return saldoFinal;
    }
    
    @Override
    public String toString(){

        return super.toString() + "\nSaldo final en su cuenta de PayPal: " + saldoFinal;

}

}
