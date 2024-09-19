package eci.parcial.Tienda;

import java.util.HashMap;
import java.util.Map;


public class Tienda{
    private Map<Integer, Integer> productos;
    private Agente agenteAdvertencia;
    private Agente agenteLog;


    public Tienda() {
        productos = new HashMap<>();
    }

    public void añadirProductoAlStock(Producto producto){
        int ID = producto.getID();
        try{
            if(productos.containsKey(ID)){
                int cantidad = productos.get(ID);
                productos.put(ID, cantidad + 1);
            } else {
                productos.put(ID, 1);
            }
        } catch (Exception e) {
        }
    }

    public void reducirProductoAlStock(Producto producto){
        int ID = producto.getID();
        if(productos.containsKey(ID)){
            int cantidad = productos.get(ID);
            if(cantidad > 0){
                    productos.put(ID, cantidad - 1);
            }           
        }
    }


    public int getCantidadStock(Producto producto){
        int ID = producto.getID();
        if(productos.containsKey(ID)){
            int cantidad = productos.get(ID);
            return cantidad;
        }
        return 0;
        
    }




}