// Taller de Programación en Java: Uso de Map y List con Entrada de Usuario
// 🚀 Ejercicio 2: Registro de Notas con Map
package com.ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Map<String, Double> notas = new HashMap<>();

            // 1. Pedir al usuario la cantidad de estudiantes.
            System.out.print("Ingrese la cantidad de estudiantes: ");
            int cantidad = scanner.nextInt();
                scanner.nextLine();

            // 2. Solicitar nombres y notas para cada estudiante y almacenarlos en un Map<String, Double> .
            for (int i = 0; i < cantidad; i ++){
                System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la nota de " + nombre + ": ");
                Double nota = scanner.nextDouble();
                scanner.nextLine();
                notas.put(nombre, nota);
            }

            // 3. Mostrar la lista completa.
            System.out.println("\nLista de estudiantes y notas : " + notas);

            // 4. Permitir buscar la nota de un estudiante ingresando su nombre.
            System.out.print("Ingrese el nombre del estudiante para ver su nota: ");
            String buscar = scanner.nextLine();
            if(notas.containsKey(buscar)) {
                System.out.println("La nota de " + buscar + " es: " + notas.get(buscar));
            } else {
                System.out.println("Estudiante no encontrado.");
            }

            // 5. Encontrar la nota más alta y el estudiante con mejor rendimiento.
            double maxNota = 0;
            String mejorEstudiante = "";
            for (Map.Entry<String, Double> entry : notas.entrySet()){
                if (entry.getValue() > maxNota){
                    maxNota = entry.getValue();
                    mejorEstudiante = entry.getKey();
                }
            }
            System.out.println("El estudiante con mejor rendimiento es " + mejorEstudiante + " con una nota de " + maxNota);
        }
    }
}