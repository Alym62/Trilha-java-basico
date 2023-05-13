public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Canal atual? " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.mudarCanal(22);
        System.out.println("O canal atual é: " + smartTv.canal);
    }
}
