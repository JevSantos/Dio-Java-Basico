public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";
        
        switch (sigla) {
            case "P" -> System.out.println("Pequeno");
            case "M" -> System.out.println("Médio");
            case "G" -> System.out.println("Grande");
            default -> System.out.println("Indefinido");

            /* Antigo
            switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
                break;
        } */
       
        }



    }

}
