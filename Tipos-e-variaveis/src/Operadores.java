
public class Operadores {
    
    public static void main(String[] args) {       
        String nomeCompleto = "Linguagem" + "JAVA";
        System.out.println(nomeCompleto + "\n");
//Atribuição:
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) - (20 / 4);
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        //Incremento:
        int numero = 5;
        System.err.println(numero);
        numero ++; // 5+1
        System.err.println(numero);
        //Decremento:
        numero --; // 6-1

        //booleano:
        //boolean  varbool = true;
        // inversão: !=

        // Operador ternário: <condição> ? <se true> : <se false>
        int a = 5;
        int b = 3;
        String c = a == b ? "sim" : "não";
        System.out.println(c);

       /** Relacionais: 
        == igual 
        > maior que 
        < menor que 
        >= maior ou igual
        <= menor ou igual
        != diferente ou negaçã
        */
        int numero1 = 1;
        int numero2 = 2;
        boolean simnao = numero1 == numero2;
        System.out.println("numero1 é igual numero2?" + " " + simnao);
                

    }



}
