/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

/**
 *
 * @author Usuario
 */
public class Furgoneta extends Vehiculo{
   float volumenLitros;

    public Furgoneta(float volumenLitros, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.volumenLitros = volumenLitros;
    }
   
   @Override
   float calcularAutonomia(){
       return 0;
   }
   public void asignarRuta(){
   }
   
}
