package eci.parcial.Tienda;

public class Producto{
    private int ID;
    private String nombre;
    private int precio;
    private int cantidad_stock;
    private String categoria;

    public Producto(int ID, String nombre, int precio,int cantidad_stock, String categoria){
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_stock = cantidad_stock;
        this.categoria = categoria;
    }

    public int getCantidadStock(){
        return cantidad_stock;
    }

    public int getID(){
        return ID;
    }
}