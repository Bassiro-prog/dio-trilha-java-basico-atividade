import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        scanner.nextLine(); // limpa o buffer

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente.concat(  ", obrigado por criar uma conta em nosso banco, sua agência é \n") +
            agencia + ", conta " + numeroConta + " e seu saldo R$ " + 
            saldo + " já está disponível para saque.");

    }
}
