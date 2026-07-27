package media_pares;

import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , soma = 0 , npares = 0;
        double media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                soma+=vect[i];
                npares++;
            }
        }
            if (npares == 0){
                System.out.println("NENHUM NUMERO PAR");
            }else {
                 media = (double)soma/npares;
                System.out.printf("\nMEDIA DOS PARES = %.1f\n",media);
            }



    }
}
