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
 * Esta clase define un objeto moto
 */
public class Moto extends Vehiculo{
    //constante para definir el valor de peaje que pagan las motos
    private final static int VALOR_PEAJE = 5000;
    
    private int cilindraje;

    /**
     * 
     * @param cilindraje
     *      cilindraje de la moto
     * @param placa
     *      placa de la moto
     * @param marca
     *      marca de la moto
     * Constructor con parametros de la clase respectiva
     */
    public Moto(int cilindraje, String placa, String marca) {
        super(placa, marca, VALOR_PEAJE);
        this.cilindraje = cilindraje;
    }
    
    //metodo para obtener el valor del cilindraje
    public int getCilindraje() {
        return cilindraje;
    }

    //metodo para setear el valor del cilindraje
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto" + " de cilindraje " + this.getCilindraje() + ", la placa es "+super.getPlaca()+", la marca es "+super.getMarca()+", paga un peaje de "+super.getValorPeaje();
    }
    
    
    
}
