public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume + "\n");

        smartTv.ligarTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume + "\n");
        smartTv.mudarCanal(45);
    }
}
