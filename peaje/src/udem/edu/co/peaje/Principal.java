/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje;

import java.util.ArrayList;
import udem.edu.co.peaje.vehiculos.Automovil;
import udem.edu.co.peaje.vehiculos.Camion;
import udem.edu.co.peaje.vehiculos.Moto;
import udem.eu.co.peaje.vehiculos.abstracto.Vehiculo;

/**
 *
 * @author DisCor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        vehiculos.add(new Automovil("monovolumen", "CBV-456", "Subaru"));
        vehiculos.add(new Moto(390, "GHJ-75A", "KTM"));
        vehiculos.add(new Camion("2", "GHJ-345", "MAC"));
        
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
    
}
