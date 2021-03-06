/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6ingsoftware;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Carrito {
    private int subtotal;
    private int totalMasImpuestos;
    private int totalCompra;
    private Cliente clienteAsociado;
    private ArrayList<Producto>productos=new ArrayList<>();
    private Envio envioSeleccionado;

    public Carrito() {
    }

    public Carrito(int subtotal, int totalMasImpuestos, int totalCompra, Cliente clienteAsociado) {
        this.subtotal = subtotal;
        this.totalMasImpuestos = totalMasImpuestos;
        this.totalCompra = totalCompra;
        this.clienteAsociado = clienteAsociado;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotalMasImpuestos() {
        return totalMasImpuestos;
    }

    public void setTotalMasImpuestos(int totalMasImpuestos) {
        this.totalMasImpuestos = totalMasImpuestos;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Envio getEnvioSeleccionado() {
        return envioSeleccionado;
    }

    public void setEnvioSeleccionado(Envio envioSeleccionado) {
        this.envioSeleccionado = envioSeleccionado;
    }
    
    
    
    public void seleccionarMetodoDeEnvio(char tipo,String provincia){
        this.envioSeleccionado=new Envio(tipo);
        this.envioSeleccionado.RellenarCampos(provincia);
    }
    
    public void a??adirProducto(Producto p){
        this.productos.add(p);
        System.out.println("Se ha a??adido el producto correctamente");
    }
    public Double subTotal(){
        Double suma=0.0;
        for(Producto prod:this.productos){
            suma=suma+prod.getPrecioProducto();
        }
        return suma;
    }
    public Double sumaTotal(){
        Double subtot=subTotal();
        Double total=subtot*1.65;
        return total;
    }
    
    public Double totalCarrito(){
        Double total = sumaTotal();
        Double sumaTotal = total+this.envioSeleccionado.getTotalEnvio();
        return sumaTotal;
    }
    
    public void agregarProductoCarrito(Producto prod){
        productos.add(prod);
    }
    public void eliminarProductoCarrito(Producto prod){
        productos.remove(prod);
    }
}
