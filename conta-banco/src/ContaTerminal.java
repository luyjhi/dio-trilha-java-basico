import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da sua conta:");
        int numero = sc.nextInt();

        System.out.println("Digite a sua agência:");
        String agencia = sc.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = sc.next();

        
        double saldo = 237.48;
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f ja está disponivel para saque.", nomeCliente, agencia, numero, saldo);
        
        sc.close();
    }
    
}
