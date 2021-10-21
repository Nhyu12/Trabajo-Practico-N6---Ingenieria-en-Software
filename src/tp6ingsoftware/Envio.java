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
public class Envio {
    private char tipo;
    private String provincia;
    private Double totalEnvio;

    public Envio() {
        
    }
    
    public Envio(char tipo){
        this.tipo=tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Double getTotalEnvio() {
        return totalEnvio;
    }

    public void setTotalEnvio(Double totalEnvio) {
        this.totalEnvio = totalEnvio;
    }
    
    public void RellenarCampos(String provincia){
        if (this.tipo=='a' || this.tipo=='b') {
            this.provincia=provincia;
            if (this.tipo=='a'){ //ENVIO A DOMICILIO
                if(this.provincia.toLowerCase().equals("mendoza")){
                    this.totalEnvio=150.0;
                }else{
                    this.totalEnvio=600.0;
                }
            }else{ //ENVIO A LA SUCURSAL MAS CERCANA
                if(this.provincia.toLowerCase().equals("mendoza")){
                    this.totalEnvio=100.0;
                }else{
                    this.totalEnvio=450.0;
                }
            }
        }
    }
    
    
}
