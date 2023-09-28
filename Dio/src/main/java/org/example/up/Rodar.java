package org.example.up;

public class Rodar {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[]{new Gerente()};

        for(Funcionario funcionario: funcionarios){
            funcionario.metodo_1();
        }

        Gerente gerente = new Gerente();
        gerente.metodo_1();
    }
}
