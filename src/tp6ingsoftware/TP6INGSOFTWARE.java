/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6ingsoftware;

/**
 *
 * @author Usuario
 */
public class TP6INGSOFTWARE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod = new Producto();
        Cliente cli = new Cliente();
        Carrito carr= new Carrito();
        carr.agregarProductoCarrito(prod);
        cli.setCarritoAsociado(carr);
        cli.eliminarProductoCarrito(prod);
    }  
}