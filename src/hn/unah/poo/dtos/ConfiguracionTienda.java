package hn.unah.poo.dtos;

public class ConfiguracionTienda {

    private static ConfiguracionTienda instancia;
    private String nombreTienda;
    private String direccion;
    private String moneda;

    
    private ConfiguracionTienda(String nombreTienda, String direccion, String moneda) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.moneda = moneda;
    }

    // Método estático para obtener la instancia
    public static ConfiguracionTienda getInstancia(String nombreTienda, String direccion, String moneda) {
        if (instancia == null) {
            instancia = new ConfiguracionTienda(nombreTienda, direccion, moneda);
        }
        return instancia;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        return "\nNombre de la tienda: " + nombreTienda + "\nDirección: " + direccion + "\nMoneda: " + moneda;
    }

}
