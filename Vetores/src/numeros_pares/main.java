package numeros_pares;

import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , qtd = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i]+" ");
            }
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                qtd+=1;
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES: %d\n", qtd);


    }
}
