import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero >= 0 ) {
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
        sc.close();
    }
}
