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
import tp6ingsoftware.Producto;
import tp6ingsoftware.Carrito;


/**
 *
 * @author Usuario
 */
public class TestUnitarios {
    @Test
    public void validarCantidadSeleccionada(){
        Producto prod = new Producto();
        prod.setStockDisponible(200);
        Carrito carr = new Carrito();
        int aux = carr.corroborarStock(prod,0 );
        assertFalse(aux >= 0); 
    }
    @Test
    public void validarCantidadStock(){
        Producto prod = new Producto();
        prod.setStockDisponible(50);
        Carrito carr = new Carrito();
        int aux = carr.corroborarStock(prod, 56);
        assertFalse(aux >= 0); 
    }
       

    
    
    
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
    //
    // @Test
    // public void hello() {}
}
