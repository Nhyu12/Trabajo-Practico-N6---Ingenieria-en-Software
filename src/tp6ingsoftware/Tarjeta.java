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
public class Tarjeta {
    private long numeroTarjeta;
    private int mesVencimiento;
    private int anioVencimiento;
    private int condSeguridad;
    private Cliente cli;

    public Tarjeta() {
    }

    public Tarjeta(long numeroTarjeta, int mesVencimiento, int anioVencimiento, int condSeguridad, Cliente cli) {
        this.numeroTarjeta = numeroTarjeta;
        this.mesVencimiento = mesVencimiento;
        this.anioVencimiento = anioVencimiento;
        this.condSeguridad = condSeguridad;
        this.cli = cli;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getMesVencimiento() {
        return mesVencimiento;
    }

    public void setMesVencimiento(int mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public int getAnioVencimiento() {
        return anioVencimiento;
    }

    public void setAnioVencimiento(int anioVencimiento) {
        this.anioVencimiento = anioVencimiento;
    }

    public int getCondSeguridad() {
        return condSeguridad;
    }

    public void setCondSeguridad(int condSeguridad) {
        this.condSeguridad = condSeguridad;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    
    
}
