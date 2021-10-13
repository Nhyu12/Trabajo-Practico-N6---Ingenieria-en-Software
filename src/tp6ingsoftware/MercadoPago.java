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
public class MercadoPago {
    private long cbu;
    private String alias;
    private Double saldo;
    private String email;
    private Cliente dueñoCuenta;

    public MercadoPago() {
    }

    public MercadoPago(long cbu, String alias, Double saldo, String email, Cliente dueñoCuenta) {
        this.cbu = cbu;
        this.alias = alias;
        this.saldo = saldo;
        this.email = email;
        this.dueñoCuenta = dueñoCuenta;
    }

    public long getCbu() {
        return cbu;
    }

    public void setCbu(long cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cliente getDueñoCuenta() {
        return dueñoCuenta;
    }

    public void setDueñoCuenta(Cliente dueñoCuenta) {
        this.dueñoCuenta = dueñoCuenta;
    }
    
    
}
