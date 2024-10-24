package hn.unah.poo.dtos;

public class ProductoAlimenticio extends Productos{

    private String fechaExpiracion;

    public ProductoAlimenticio(String nombre, double precio, int stock, String fechaExpiracion) {
        super(nombre, precio, stock);
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString(){

        return super.toString() + "\nFecha de expiracion: " + fechaExpiracion;

}

}