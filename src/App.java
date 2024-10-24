import hn.unah.poo.dtos.*;
import hn.unah.poo.interfaces.*;

public class App {
    public static void main(String[] args) throws Exception {

        ConfiguracionTienda config1 = ConfiguracionTienda.getInstancia("Mi Tienda", "Col. hato de enmedio", "LPS");
        System.out.println(config1);

        ProductoAlimenticio pedido1 = new ProductoAlimenticio("Manzana", 60.0, 10, "11-12-25" ); 
        ProductoAlimenticio pedido2 = new ProductoAlimenticio("Pera", 50.0, 10, "10-12-25" ); 
        ProductoElectronico pedido3 = new ProductoElectronico("Celular", 5000.00, 3, "6 meses");
        ProductoElectronico pedido4 = new ProductoElectronico("Televisor", 1000.00, 4, "12 meses");

        Productos[] pedidos = {pedido1, pedido2, pedido3, pedido4};

        }


    }
