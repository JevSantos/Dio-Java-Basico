
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String enfeite = "****";

        System.out.println(enfeite + " TERMINAL DE ABERTURA DE CONTA " + enfeite);
        System.out.println("Olá, Benvindo! \n");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextInt();

        System.out.println("Olá, obrigado por criar uma conta em nosso banco senhor " + nome);
        System.out.println("Sua agência é " + agencia);
        System.out.println("Sua conta " + conta);
        System.out.println("Seu saldo de " + saldo + "já está disponível para saque");
    }
}