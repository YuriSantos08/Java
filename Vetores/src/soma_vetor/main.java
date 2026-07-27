package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f  ",vect[i]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        System.out.printf("SOMA = %.2f%n",soma);
        double media = soma / vect.length;
        System.out.printf("MEDIA = %.2f%n",media);
        sc.close();

    }
}
