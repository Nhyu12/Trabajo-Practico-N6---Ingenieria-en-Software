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
import tp6ingsoftware.Carrito;
import tp6ingsoftware.Producto;

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
    //Verificar que el precio total (total de productos + impuestos + envio) sea igual al calculado. Para ello, tomaremos los siguientes datos
    //Nombre: "Procesador Ryzen 3"
    //Codigo: 25568745
    //Descripcion: "descripcion prod"
    //Stock:25
    //Precio: 250.0
    //Inpuestos: 65%. Me da un total de: 487.5
    //Envio: Seleccionamos envio a domicilio, en una provincia fuera de Mendoza (Concretamente Buenos Aires), por lo que el envio total es de 600.0
    //TOTAL DE LA COMPRA(PRODUCTOS+ENVIO+IMPUESTOS)=1837.5
    @Test
    public void ValidarSumaTotalMasEnvio(){
        Producto p1 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Producto p2 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Producto p3 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Carrito c = new Carrito();
        c.añadirProducto(p1);
        c.añadirProducto(p2);
        c.añadirProducto(p3);
        c.seleccionarMetodoDeEnvio('a',"buenos aires");
        assertEquals(c.totalCarrito(),1837.5,0);
        
    }
    
    
    //Verificar que el precio total (total de productos + impuestos) sea igual al calculado. Para ello, tomaremos los siguientes datos
    //Nombre: "Procesador Ryzen 3"
    //Codigo: 25568745
    //Descripcion: "descripcion prod"
    //Stock:25
    //Precio: 250.0
    //Inpuestos: 65%. Me da un total de: 487.5
    //Suma Total (productos+impuestos)=1237.5
    @Test
    public void validarSumaTotal(){
        Producto p1 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Producto p2 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Producto p3 = new Producto(255621579,"Procesador Ryzen 3","descripcion prod",25,250.0);
        Carrito c = new Carrito();
        c.añadirProducto(p1);
        c.añadirProducto(p2);
        c.añadirProducto(p3);
        assertEquals(c.sumaTotal(),1237.5,0);
    }
}
