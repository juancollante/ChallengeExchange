package com.alura;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            CurrencyConverter converter = new CurrencyConverter();

            while (true) {
                System.out.println("Seleccione las monedas para convertir:");
                System.out.println("1. USD a EUR");
                System.out.println("2. USD a GBP");
                System.out.println("3. Salir");
                int opcion = scanner.nextInt();

                if (opcion == 3) {
                    break;
                }

                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();

                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = converter.convert("USD", "EUR", monto);
                        System.out.println("Resultado: " + resultado + " EUR");
                        break;
                    case 2:
                        resultado = converter.convert("USD", "GBP", monto);
                        System.out.println("Resultado: " + resultado + " GBP");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
        }
        scanner.close();
    }
}
