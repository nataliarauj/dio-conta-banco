import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("-=-=-=-= Sistema Bancário -=-=-=-=");

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Por gentiliza, insira o número da agência:");
        String agencia = ler.nextLine();

        System.out.println("Agora, informa o número da conta");
        int numeroConta = ler.nextInt();

        System.out.println("Por fim, informe seu saldo");
        double saldo = ler.nextFloat();

        ler.close();

        System.out.println("Olá, " + nome + ". Obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
