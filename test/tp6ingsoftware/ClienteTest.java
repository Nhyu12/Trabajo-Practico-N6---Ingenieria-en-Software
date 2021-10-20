/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6ingsoftware;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    
    public ClienteTest() {
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
    
    
    @Test
    public void clienteTieneCorreoElectronicoAsociado() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        instance.setEmail("gaston97_fernandez@hotmail.com");
        String expResult = "gaston97_fernandez@hotmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);              
    }

       
    
    @Test
    public void clienteTieneLocalidadAsociada() {
        System.out.println("getDomicilioCliente");
        Cliente instance = new Cliente();
        Domicilio domi = new Domicilio();
        domi.setLocalidad("Godoy Cruz");
        instance.setDomicilioCliente(domi);
        String expResult = "Godoy Cruz";
        String result = instance.getDomicilioCliente().getLocalidad();
        assertEquals(expResult, result);
        
    }

   }
