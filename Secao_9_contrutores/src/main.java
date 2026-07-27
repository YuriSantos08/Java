import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        String numeroConta = sc.nextLine();
        System.out.print("Enter account holder: ");
        String titularConta = sc.nextLine();
        System.out.print("Is there na initial deposit(y/n)? ");
        char resp = sc.next().charAt(0);

        if (resp == 'y'|| resp == 'Y' ){
            System.out.print("enter initial deposit value: ");
            Double valor = sc.nextDouble();
            conta = new Conta(numeroConta, titularConta, valor);
            System.out.println("Account data: ");
            System.out.println(conta.toString());

            System.out.print("Enter a deposit value: ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);
            System.out.println(conta.toString());

            System.out.println("Enter a withdraw value: ");
            double saque = sc.nextDouble();
            conta.saque(saque);
            System.out.println(conta.toString());
        } else if (resp == 'n'|| resp == 'N' ) {
            conta = new Conta(numeroConta, titularConta);
            System.out.println("Account data: ");
            System.out.println(conta.toString());

            System.out.print("Enter a deposit value: ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);
            System.out.println(conta.toString());

            System.out.println("Enter a withdraw value: ");
            double saque = sc.nextDouble();
            conta.saque(saque);
            System.out.println(conta.toString());
        }else {
            System.out.print("Invalid input");
        }



        sc.close();
    }
}
