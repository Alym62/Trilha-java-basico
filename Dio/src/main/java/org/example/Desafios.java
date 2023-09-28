package org.example;

import java.util.Scanner;

public class Desafios {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        for(int i = 0; i < tamanho; i++){
            System.out.print("/");
        }
    }
}

