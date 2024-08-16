public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual: " + canal);
    }
    public void ligarTv() {
        ligada = true;
    }
    public void desligarTv() {
        ligada = false;
    }
    public void aumentarCanal() {
        canal ++;
        System.out.println("Canal atual: " + canal);
    }
    public void diminuirCanal() {
        canal --;
        System.out.println("Canal atual: " + canal);
    }
    public void aumentarVolume() {
        volume ++;
    }
    public void diminuirVolume() {
        volume --;
    }
}
