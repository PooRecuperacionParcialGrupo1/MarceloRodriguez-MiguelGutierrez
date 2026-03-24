/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pppoogrupo1;

import Tipo1.Camion;
import Tipo1.Furgoneta;
import Tipo1.Vehiculo;
import java.util.ArrayList;

public class PPPOOGrupo1 {

    public static void main(String[] args) {
        
        // PUNTO 4: 2 Arreglos dinámicos
        ArrayList<Camion> arregloCamiones = new ArrayList<>();
        ArrayList<Furgoneta> arregloFurgonetas = new ArrayList<>();
        
        // PUNTO 3: Instanciar 4 objetos de cada uno garantizando que no se repitan
        Camion c1 = new Camion(20.5, "CAM-001", "FH16", "Volvo") {};
        Camion c2 = new Camion(15.0, "CAM-002", "Actros", "Mercedes") {};
        Camion c3 = new Camion(25.0, "CAM-003", "R500", "Scania") {};
        Camion c4 = new Camion(10.0, "CAM-001", "Repetido", "Falso") {}; // Placa repetida

        Furgoneta f1 = new Furgoneta(1500.0, "FUR-001", "Transit", "Ford");
        Furgoneta f2 = new Furgoneta(2000.0, "FUR-002", "Sprinter", "Mercedes");
        Furgoneta f3 = new Furgoneta(1800.0, "FUR-003", "Daily", "Iveco");
        Furgoneta f4 = new Furgoneta(800.0, "FUR-001", "Repetido", "Falso"); // Placa repetida

        // Garantizamos que no ingresen repetidos usando .contains() (que usa tu equals() de Vehiculo)
        if(!arregloCamiones.contains(c1)) arregloCamiones.add(c1);
        if(!arregloCamiones.contains(c2)) arregloCamiones.add(c2);
        if(!arregloCamiones.contains(c3)) arregloCamiones.add(c3);
        if(!arregloCamiones.contains(c4)) arregloCamiones.add(c4); // No entrará
        
        if(!arregloFurgonetas.contains(f1)) arregloFurgonetas.add(f1);
        if(!arregloFurgonetas.contains(f2)) arregloFurgonetas.add(f2);
        if(!arregloFurgonetas.contains(f3)) arregloFurgonetas.add(f3);
        if(!arregloFurgonetas.contains(f4)) arregloFurgonetas.add(f4); // No entrará
        
        // PUNTO 5: Imprimir invocando mostrarInfoGeneral() y calcularAutonomia() de ambos para demostrar polimorfismo
        System.out.println("----- PUNTO 5: POLIMORFISMO -----");
        // Unimos los arreglos en uno de la clase padre
        ArrayList<Vehiculo> flotaCompleta = new ArrayList<>();
        flotaCompleta.addAll(arregloCamiones);
        flotaCompleta.addAll(arregloFurgonetas);
        
        for (Vehiculo vehiculo : flotaCompleta) {
            System.out.println(vehiculo.mostrarInfoGeneral());
            System.out.println("Autonomía calculada: " + vehiculo.calcularAutonomia());
            System.out.println("---------------------------------");
        }
        
        // PUNTO 6: Demostrar los 3 métodos asignarRuta() sobrecargados usando el for en el arreglo de Camión
        System.out.println("\n----- PUNTO 6: SOBRECARGA EN CAMIONES -----");
        for (Camion camion : arregloCamiones) {
            System.out.println("\nPara el camión con placa " + camion.placa + ":");
            camion.asignarRuta();                               // Llama al método 1 (Sin parámetros)
            camion.asignarRuta("Bogotá");                       // Llama al método 2 (1 parámetro)
            camion.asignarRuta("Medellín", 420.5);              // Llama al método 3 (2 parámetros)
        }
    }
}