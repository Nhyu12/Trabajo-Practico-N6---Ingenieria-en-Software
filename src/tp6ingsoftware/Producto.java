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
public class Producto extends TipoProducto {
    private long codigo;
    private Carrito carritoAsociado;

    public Producto(long codigo, Carrito carritoAsociado, String nombreProducto, String descripcionProducto, int stockDisponible) {
        super(nombreProducto, descripcionProducto, stockDisponible);
        this.codigo = codigo;
        this.carritoAsociado = carritoAsociado;
    }

    public Producto(String nombreProducto, String descripcionProducto, int stockDisponible) {
        super(nombreProducto, descripcionProducto, stockDisponible);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Carrito getCarritoAsociado() {
        return carritoAsociado;
    }

    public void setCarritoAsociado(Carrito carritoAsociado) {
        this.carritoAsociado = carritoAsociado;
    }
    
    
    
    
    
    
}
