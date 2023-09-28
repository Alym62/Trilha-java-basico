package org.example;

public class Main {
    public static void main(String[] args) {
        // RETORNO
        String helloWorld = Retorno.getMessage();

        System.out.println(helloWorld);

        // CALCULADORA
        Calculadora calculadora;

        // HORAS
        Mensagem.mesagem(13);

        // Quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(5.2, 5.2);

        // EBOOK
        String[] names;

        names = new String[10];

        names[0] = "Aly";
    }
}