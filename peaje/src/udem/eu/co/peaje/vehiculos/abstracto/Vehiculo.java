/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.eu.co.peaje.vehiculos.abstracto;

/**
 * @author DisCor
 * @version 1.0
 * @since 18-09-2020
 * Esta clase define un objeto vehiculo (En este caso es super clase)
 */
public abstract class Vehiculo { 
    private String placa;
    private String marca;
    private int valorPeaje;

    /**
     * 
     * @param placa
     *      placa del vehiculo
     * @param marca
     *      marca del vehiculo
     * @param valorPeaje 
     *      valor de peaje del vehiculo
     * Constructor con parametros 
     */
    public Vehiculo(String placa, String marca, int valorPeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
    }

    //metodo get para obtener de la placa del vehiculo
    public String getPlaca() {
        return placa;
    }

    //metodo para setear el valor de la placa del vehiculo
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //metodo get para obtener la marca del vehiculo
    public String getMarca() {
        return marca;
    }

    //metodo para setear el valor de la marca del vehiculo
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //metodo get para obtener del valorPeaje del vehiculo
    public int getValorPeaje() {
        return valorPeaje;
    }

    //metodo para setear el valor del peaje del vehiculo
    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

}
