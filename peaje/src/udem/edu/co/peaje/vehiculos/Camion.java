/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje.vehiculos;

import udem.eu.co.peaje.vehiculos.abstracto.Vehiculo;

/**
 * @author DisCor
 * @version 1.0
 * @since 18-09-2020
 * Esta clase define un objeto vehiculo
 */
public class Camion extends  Vehiculo{
    //constante para definir el valor de peaje que pagan los camiones
    private final static int VALOR_PEAJE = 30000;
    
    private String numeroEjes;

    /**
     * 
     * @param numeroEjes
     *      numero de ejes del camion
     * @param placa
     *      placa del camion
     * @param marca
     *      marca del camion
     * Constructor con parametros de la clase Camion
     */
    
    public Camion(String numeroEjes, String placa, String marca) {
        super(placa, marca, VALOR_PEAJE);
        this.numeroEjes = numeroEjes;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camion con " + "un numero de ejes de " + this.getNumeroEjes()+", la placa es "+super.getPlaca()+", la marca es "+super.getMarca()+", paga un peaje de "+super.getValorPeaje();
    }
    
    
    
}
