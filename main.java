package com.ejemplo.calculadora;
//Miguel Polvillo
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== Calculadora Java ===");

        while (continuar) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double a = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double b = sc.nextDouble();

            double resultado = 0;
            try {
                switch (opcion) {
                    case 1 -> resultado = calc.sumar(a, b);
                    case 2 -> resultado = calc.restar(a, b);
                    case 3 -> resultado = calc.multiplicar(a, b);
                    case 4 -> resultado = calc.dividir(a, b);
                    default -> System.out.println("Opción inválida.");
                }
                if (opcion >= 1 && opcion <= 4) {
                    System.out.println("Resultado: " + resultado);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
