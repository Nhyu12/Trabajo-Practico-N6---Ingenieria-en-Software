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
public class Producto {
    private long codigo;
    private Carrito carritoAsociado;
    private String nombreProducto;
    private String descripcionProducto;
    private int stockDisponible;
    
    public Producto(){}

    public Producto(long codigo, String nombreProducto, String descripcionProducto, int stockDisponible) {
        this.nombreProducto= nombreProducto;
        this.descripcionProducto= descripcionProducto;
        this.stockDisponible = stockDisponible;
        this.codigo = codigo;
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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }
    
  
}
