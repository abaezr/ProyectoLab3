/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParqueaderoFinal;

import java.util.ArrayList;
import java.util.Calendar;



/**
 *
 * @author Sebas
 */
public class Vehiculo {
    //atributos
    int tiempoDeIngreso;
    int tiempoDeSalida;
    int costoTotal;
    int tiempoTotal;
    String tipoDeVehiculo;
    String placaDeVehiculo;
    boolean vehiculoEnParqueadero; 
    ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    
    //constructor

    public Vehiculo() {}
}
