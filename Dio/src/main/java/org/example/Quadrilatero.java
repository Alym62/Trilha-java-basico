package org.example;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado_1, double lado_2){
        System.out.println("Área do retângulo:" + lado_1 * lado_2);
    }

    public static void area(float diagonal_1, float diagonal_2){
        System.out.println("Área do losango:" + (diagonal_1 * diagonal_2));
    }
}
