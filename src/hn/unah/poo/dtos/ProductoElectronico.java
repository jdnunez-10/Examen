package hn.unah.poo.dtos;

public class ProductoElectronico extends Productos{

    private String garantia;

    public ProductoElectronico(String nombre, double precio, int stock, String garantia) {
        super(nombre, precio, stock);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    } 

    @Override
    public String toString(){

        return super.toString() + "\nTiene garantia de: " + garantia;

}

}