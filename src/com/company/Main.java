package com.company;

import java.util.Scanner;

public class Main {
    public static int validarNumero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
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
        primerNumero = validarNumero(sc);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = validarNumero(sc);
        System.out.print("Introduce un tercer número: ");
        tercerNumero = validarNumero(sc);
        sc.close();
        System.out.println(ordenarNumeros(primerNumero, segundoNumero, tercerNumero));
    }
}
