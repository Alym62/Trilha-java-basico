package org.example.poo;

public class RodarAplicacao {
    public static void main(String[] args){
        System.out.println("Primeiro Carro: 🚗");
        Carro carro_1 = new Carro();

        carro_1.setCor("Preto");
        carro_1.setModelo("BMW i8");
        carro_1.setCapacidadeDoTanque(59);

        System.out.println(carro_1.getCor());
        System.out.println(carro_1.getModelo());
        System.out.println(carro_1.getCapacidadeDoTanque());

        System.out.println("Segundo Carro: 🚗");
        Carro carro_2 = new Carro("Azul", "BMW 320", 66);

        System.out.println(carro_2.getCor());
        System.out.println(carro_2.getModelo());
        System.out.println(carro_2.getCapacidadeDoTanque());
    }
}
