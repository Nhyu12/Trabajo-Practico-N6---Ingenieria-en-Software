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
public abstract class TipoProducto {
    private String nombreProducto;
    private String descripcionProducto;
    private int stockDisponible;

    public TipoProducto(String nombreProducto, String descripcionProducto, int stockDisponible) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.stockDisponible = stockDisponible;
    }

}
