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
public class Cliente {
    private String nombreCliente;
    private long numeroCliente;
    private String email;
    private Carrito carritoAsociado;
    private ArrayList<Tarjeta> tarjetasAsociadas = new ArrayList<>();
    private MercadoPago mercadoPagoAsociado;
    private Domicilio domicilioCliente;

    public Cliente() {
    }

    public Cliente(String nombreCliente, long numeroCliente, String email, Carrito carritoAsociado, MercadoPago mercadoPagoAsociado, Domicilio domicilioCliente) {
        this.nombreCliente = nombreCliente;
        this.numeroCliente = numeroCliente;
        this.email = email;
        this.carritoAsociado = carritoAsociado;
        this.mercadoPagoAsociado = mercadoPagoAsociado;
        this.domicilioCliente = domicilioCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carrito getCarritoAsociado() {
        return carritoAsociado;
    }

    public void setCarritoAsociado(Carrito carritoAsociado) {
        this.carritoAsociado = carritoAsociado;
    }

    public ArrayList<Tarjeta> getTarjetasAsociadas() {
        return tarjetasAsociadas;
    }

    public void setTarjetasAsociadas(ArrayList<Tarjeta> tarjetasAsociadas) {
        this.tarjetasAsociadas = tarjetasAsociadas;
    }

    public MercadoPago getMercadoPagoAsociado() {
        return mercadoPagoAsociado;
    }

    public void setMercadoPagoAsociado(MercadoPago mercadoPagoAsociado) {
        this.mercadoPagoAsociado = mercadoPagoAsociado;
    }

    public Domicilio getDomicilioCliente() {
        return domicilioCliente;
    }

    public void setDomicilioCliente(Domicilio domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }
    
    
}
