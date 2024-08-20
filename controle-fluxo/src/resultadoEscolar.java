/**
 * resultadoEscolar
 */
public class resultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
/*
        if (nota >= 7){
            System.err.println("Aprovado!");
        }
        else if (nota >=5 && nota < 7) {
            System.out.println("Fazer prova de recuperação");
            
        }
        else{
            System.out.println("Reprovado");
        }*/
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        
        System.out.println(resultado);
    }

    
}
