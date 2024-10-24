package hn.unah.poo.dtos;
public class Pedidos {

    private int cantidad;
    private String producto;
    private int precioProducto;

    public Pedidos(int cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    
    }

    public void agregarProducto(){

        System.out.println("Ha agregado la cantidad de " + cantidad +  " de " + producto);
    }

    public double calcularTotal(){
        
        System.out.println("Precio total del pedido: " );
        
        return  cantidad*precioProducto;

    }

    public void procesarPedido(){

    }
}