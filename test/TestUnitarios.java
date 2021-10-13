/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tp6ingsoftware.*;

/**
 *
 * @author Usuario
 */
public class TestUnitarios {
    
    public TestUnitarios() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:

    //Validar que al agregar un producto al carrito se llene el campo cantidad.
    @Test
    public void validarCantidadAlAgregarProducto() {
        Producto prod = new Producto();
        Carrito carrito = new Carrito();
        int cantidad = carrito.getProductos().size();
        carrito.agregarProductoCarrito(prod);
        assertEquals(carrito.getProductos().size(),cantidad+1);
    }
    //Validar que al agregar un producto al carrito se llene el campo nombre.
    @Test
    public void validarNombreDeProductoAgregado(){
        Producto prod = new Producto(458,"Procesador","Descripcion",20);
        Carrito carrito = new Carrito();
        carrito.agregarProductoCarrito(prod);
        String nombre="";
        for(Producto produ:carrito.getProductos()){
            nombre= produ.getNombreProducto();
        }
        assertEquals(prod.getNombreProducto(),nombre);
    }
    
    @Test
    public void validarCantidadMinimaAgregadaProducto() {
	Producto prod = new Producto();
	Carrito carro = new Carrito();
	carro.agregarProductoCarrito(prod);
	int cantidad = carro.getProductos().size();
	assertTrue(0<cantidad);
    }
    
    @Test
    public void validarCarritoVacio() {
	Producto prod = new Producto();
        Carrito car = new Carrito();
        car.agregarProductoCarrito(prod);
        car.eliminarProductoCarrito(prod);
	assertTrue(car.getProductos().isEmpty());
    }
}
