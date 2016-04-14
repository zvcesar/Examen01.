/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author zvcesar
 */
public class Automovil {
private String numeroRegistro;
private String nombreDueño;
private String cedulaDueño;
private String placaAutomovil;

    public Automovil(String numeroRegistro, String nombreDueño, String cedulaDueño, String placaAutomovil) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueño = nombreDueño;
        this.cedulaDueño = cedulaDueño;
        this.placaAutomovil = placaAutomovil;
    }

    /**
     * @return the numeroRegistro
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numeroRegistro the numeroRegistro to set
     */
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    /**
     * @return the nombreDueño
     */
    public String getNombreDueño() {
        return nombreDueño;
    }

    /**
     * @param nombreDueño the nombreDueño to set
     */
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    /**
     * @return the cedulaDueño
     */
    public String getCedulaDueño() {
        return cedulaDueño;
    }

    /**
     * @param cedulaDueño the cedulaDueño to set
     */
    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }

    /**
     * @return the placaAutomovil
     */
    public String getPlacaAutomovil() {
        return placaAutomovil;
    }

    /**
     * @param placaAutomovil the placaAutomovil to set
     */
    public void setPlacaAutomovil(String placaAutomovil) {
        this.placaAutomovil = placaAutomovil;
    }

}
