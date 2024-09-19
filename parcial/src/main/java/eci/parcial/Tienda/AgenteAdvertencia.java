package eci.parcial.Tienda;
public class AgenteAdvertencia implements Agente {

    @Override
    public void mensaje(String producto, int cantidad){
        System.out.println("Alerta El stock del Producto: " + producto + "Es muy bajo, solo quedan " + cantidad);
    }
}