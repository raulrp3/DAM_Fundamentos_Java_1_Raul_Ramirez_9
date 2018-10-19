package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion) {
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 0: {
                while (!sc.hasNextInt()) {
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1: {
                while (!sc.hasNextDouble()) {
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return validado;
    }

    public static String ordenarNumeros(int a, int b, int c) {
        String numerosOrdenados;
        if (a > b && a > c) {
            if (b > c) {
                numerosOrdenados = String.format("Números ordenados: %d,%d,%d", a, b, c);
            } else {
                numerosOrdenados = String.format("Números ordenados: %d,%d,%d", a, c, b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                numerosOrdenados = String.format("Números ordenados: %d,%d,%d", b, a, c);
            } else {
                numerosOrdenados = String.format("Números ordenados: %d,%d,%d", b, c, a);
            }
        } else {
            if (a > b) {
                numerosOrdenados = String.format("Números ordenados: %d,%d,%d", c, a, b);
            } else {
                numerosOrdenados = String.format("Números ordenados: %d.%d.%d", c, b, a);
            }
        }
        return numerosOrdenados;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero, tercerNumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a ordenar 3 números de mayor a menor.");
        System.out.print("Introduce un primer número: ");
        primerNumero = (int) validador(0);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = (int) validador(0);
        System.out.print("Introduce un tercer número: ");
        tercerNumero = (int) validador(0);
        sc.close();
        System.out.println(ordenarNumeros(primerNumero, segundoNumero, tercerNumero));
    }
}
