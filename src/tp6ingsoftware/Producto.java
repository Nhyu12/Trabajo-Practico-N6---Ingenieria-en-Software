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
    private String nombreProducto;
    private String descripcionProducto;
    private int stockDisponible;
    private Double precioProducto;
    private long codigo;
    private Carrito carritoAsociado;

    public Producto(long codigo, String nombreProducto, String descripcionProducto, int stockDisponible, Double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.stockDisponible = stockDisponible;
        this.precioProducto= precioProducto;
        this.codigo = codigo;
    }

    public Producto() {
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
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
