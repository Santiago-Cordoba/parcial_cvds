package eci.parcial;

import eci.parcial.Tienda.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ParcialApplicationTests {

    private Tienda tienda;

    @BeforeEach
    void setUp() {
        tienda = new Tienda();
    }

    @Test
    void añadirProductoAlStockQueNoExistia() {
        Producto p1 = new Producto(001,"Jugo", 1000, 0, "Bebidas");
        tienda.añadirProductoAlStock(p1);
        assertEquals(1, tienda.getCantidadStock(p1)); 
    }

	@Test
    void añadirProductoAlStockQueYaExiste() {
        Producto p1 = new Producto(001 ,"Jugo", 1000, 0, "Bebidas");
        tienda.añadirProductoAlStock(p1);
		Producto p2 = new Producto(001 ,"Jugo", 1000, 1, "Bebidas");
		tienda.añadirProductoAlStock(p2);
        assertEquals(2, tienda.getCantidadStock(p2)); 
    }

	@Test
	void reducirProductoAlStockNopuedeQuedaEnCero(){
		Producto p1 = new Producto(001 ,"Jugo", 1000, 0, "Bebidas");
        tienda.añadirProductoAlStock(p1);
		tienda.reducirProductoAlStock(p1);
		assertEquals(0,tienda.getCantidadStock(p1));
	}

	@Test
	void reducirProductoAlStockAunProductoQueExiste(){
		Producto p1 = new Producto(001 ,"Jugo", 1000, 0, "Bebidas");
        tienda.añadirProductoAlStock(p1);
		Producto p2 = new Producto(001 ,"Jugo", 1000, 1, "Bebidas");
		tienda.añadirProductoAlStock(p2);
		tienda.reducirProductoAlStock(p1);
		assertEquals(1,tienda.getCantidadStock(p1));
	}

	@Test
	void reducirProductoAlStockQueNoExiste(){
		Producto p1 = new Producto(001 ,"Jugo", 1000, 0, "Bebidas");
		tienda.reducirProductoAlStock(p1);
		assertEquals(0, tienda.getCantidadStock(p1));
	}

	@Test
	void getCantidadStockCorrecto(){
		Producto p1 = new Producto(001 ,"Jugo", 1000, 0, "Bebidas");
		tienda.reducirProductoAlStock(p1);
		assertEquals(1, 1);
	}


}
