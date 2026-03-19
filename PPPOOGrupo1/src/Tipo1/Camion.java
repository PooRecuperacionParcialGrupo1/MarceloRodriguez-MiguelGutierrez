/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Usuario
 */
public class Camion extends Vehiculo{

    int capacidadCargaToneladas;
    String atriDestino;
    float atriDistancia;

    public Camion(int capacidadCargaToneladas, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }
    
    
        
    @Override
    float calcularAutonomia() {
        return 0;
    }
    
}
