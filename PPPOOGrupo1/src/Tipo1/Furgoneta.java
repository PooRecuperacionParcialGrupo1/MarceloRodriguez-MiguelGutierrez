/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo1;

public class Furgoneta extends Vehiculo{
    
    // PUNTO 1: El examen exige que sea double
    public double volumenLitros;

    public Furgoneta(double volumenLitros, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.volumenLitros = volumenLitros;
    }
   
    // PUNTO 1: Simular cálculo estándar
    @Override
    public double calcularAutonomia(){
       return volumenLitros * 0.85; // Simulación
    }
    
    // PUNTO 2: Tres métodos sobrecargados asignarRuta()
    public void asignarRuta() {
        System.out.println("Ruta estándar asignada. Sin destino específico aún.");
    }
    
    public void asignarRuta(String atrDestino) {
        System.out.println("Ruta asignada con destino a: " + atrDestino);
    }
    
    public void asignarRuta(String atrDestino, double atrDistanciaKm) {
        System.out.println("Ruta asignada al destino " + atrDestino + ". Distancia total: " + atrDistanciaKm + " km. Preparando logística pesada.");
    }
}
