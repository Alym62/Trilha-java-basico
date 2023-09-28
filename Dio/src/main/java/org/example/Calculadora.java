package org.example;

public class Calculadora implements OpracaoMatematica {
    @Override
    public void sum(double operando_1, double operando_2){
        double resultado = operando_1 + operando_2;

        System.out.println("A soma de " + operando_1 + " mais " + operando_2 + " é " + resultado);
    }
    @Override
    public  void sub(double operando_1, double operando_2){
        double resultado = operando_1 - operando_2;

        System.out.println("A soma de " + operando_1 + " menos " + operando_2 + " é " + resultado);
    }
    @Override
    public void div(double operando_1, double operando_2){
        double resultado = operando_1 / operando_2;

        System.out.println("A divisão de " + operando_1 + " dividido por " + operando_2 + " é " + resultado);
    }
    @Override
    public void mul(double num1, double num2){
        double resultado = num1 * num2;

        System.out.println("A multiplicação de " + num1 + " x " + num2 + " é " + resultado);
    }
}
