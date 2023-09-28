package org.example.poo;

public class Carro extends Veiculo{
    String cor;
    String modelo;
    int capacidadeDoTanque;

    // CONSTRUTOR
    Carro(){}
    Carro(String cor, String modelo, int capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    // GET e SET
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    // MÉTODO
    double totalValorDoTanque(double valorGasolina) {
        return capacidadeDoTanque * valorGasolina;
    }
}
