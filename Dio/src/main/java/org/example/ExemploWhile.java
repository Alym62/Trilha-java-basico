package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args){
        String nome = "Aly";
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println(nome + " gastou toda a sua mesada! 👏");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
