package eci.parcial.Tienda;
public class AgenteLog implements Agente{

    @Override
    public void mensaje(String producto, int cantidad){
        System.out.println("Producto: " + producto + "-> " + cantidad + "disponibles");
    }
}