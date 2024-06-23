import java.util.Scanner;
public class ContaTerminal {
    Scanner scan = new Scanner(System.in);
    int numero;
    String agencia;
    String nomeCli;
    double saldo;

    public static void main(String [] args) {
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Olá " + conta.nomeCli() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia() + ", conta " + conta.numero() + " e seu saldo de R$" + conta.saldo() + " já está disponível para saque.");
    }


    public int numero(){
        System.out.println("Digite o numero da sua conta: ");
        numero = scan.nextInt();
        return numero;
    }

    public String agencia(){
        System.out.println("Digite a sua agência: ");
        agencia = scan.nextLine();
        return agencia;
    }

    public String nomeCli(){
        System.out.println("Digite o seu nome: ");
        nomeCli = scan.nextLine();
        return nomeCli;
    }

    public double saldo(){
        System.out.println("Digite o seu saldo: ");
        saldo = scan.nextDouble();
        return saldo;
    }

}