package org.example;

public class Mensagem {

    public static void mesagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
                mensagemBomDia();
                break;
            case 12:
                mensagemDoAlmoco();
                break;
            default:
                System.out.println("Fora de serviço! 🚨");
        }
    }

    private static void mensagemDoAlmoco() {
        System.out.println("Hora do almoço! 🧆");
    }

    public static void mensagemBomDia(){
        System.out.println("Bom dia! 🌞");
    }
}
