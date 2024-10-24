package hn.unah.poo.dtos;

import hn.unah.poo.interfaces.IMetodoPago;

public class PagoTarjetaCredito implements IMetodoPago{

    private double monto;
    private double saldo;
    private double saldoFinal;

    private PagoTarjetaCredito(double monto, double saldo) {
        this.monto = monto;
        this.saldo = saldo;
    }

    public double getMonto() {
        return monto;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }   

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
        public double getSaldoFinal() {
            return saldoFinal;
        }
    
        public void setSaldoFinal(double saldoFinal) {
            this.saldoFinal = saldoFinal;
        }
    
    
    @Override
    public double procesarPago(double monto) {      

        if (monto < saldo ) {
            System.out.println("Procesando tarjeta de credito... ");
            System.out.println("\nVerificando... ");
            System.out.println("\n...Pago realizado ");
            
        }else{

            System.out.println("\nNo se pudo realizar pago: ");
            System.out.println("\nFondos insuficientes");
        }

        
        saldoFinal = monto - saldo;
        return saldoFinal;
    }

    @Override
    public String toString(){

        return super.toString() + "\nSaldo final en su Tarjeta de Credito: " + saldoFinal;

}

}