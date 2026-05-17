import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca1 ,peca2 , num_peca1 ,  num_peca2;
        double v_peca1 , v_peca2 , v1 , v2;

        System.out.println("Informe o codigo da peça 1: ");
        peca1 = sc.nextInt();
        System.out.println("Informe a quantidade de peças 1: ");
        num_peca1 = sc.nextInt();
        System.out.println("Informe o valor unitario da peça 1: ");
        v_peca1 = sc.nextDouble();
        System.out.println("Informe o codigo da  segundo peça: ");
        peca2 = sc.nextInt();
        System.out.println("Informe a quantidade de pecas 2: ");
        num_peca2 = sc.nextInt();
        System.out.println("Informe o valor unitario das peças 2");
        v_peca2 = sc.nextDouble();

        v1 = v_peca1 * num_peca1;
        v2 = v_peca2 * num_peca2;
        double total = v1 + v2;

        System.out.printf("Valor a ser pagao: %.2f" , total);
        sc.close();
    }
}
