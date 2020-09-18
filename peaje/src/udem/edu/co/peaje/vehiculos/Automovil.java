/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje.vehiculos;

import udem.eu.co.peaje.vehiculos.abstracto.Vehiculo;

/**
 *
 * @author DisCor
 */
public class Automovil extends Vehiculo{
     //constante para definir el valor de peaje que pagan los automoviles
    private final static int VALOR_PEAJE = 15000;
    
    private String tipoCarroceria;
    /**
     * 
     * @param tipoCarroceria
     *      tipo de carrocería del automovil
     * @param placa
     *      placa del automovil
     * @param marca
     *      marca del automovil
         valor de peaje del automovl
     */
    public Automovil(String tipoCarroceria, String placa, String marca) {
        super(placa, marca, VALOR_PEAJE);
        this.tipoCarroceria = tipoCarroceria;
    }
    
    //metodo para obtener el tipo de carrocería del vehiculo
    public String getTipoCarroceria() {
        return tipoCarroceria;
    }
    
    //metodo para setear el tipo de carrocería del vehiculo
    public void setTipoCarroceria(String tipoCarrocería) {
        this.tipoCarroceria = tipoCarrocería;
    }

    @Override
    public String toString() {
        return "Automovil con " + "una carroceria tipo " + this.tipoCarroceria + ", la placa es "+super.getPlaca()+", la marca es "+super.getMarca()+", paga un peaje de "+super.getValorPeaje();
    }
    
    

    
    
    
}
