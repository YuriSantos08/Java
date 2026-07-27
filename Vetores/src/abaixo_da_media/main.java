package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < vect.length; i++) {
            soma+=vect[i];
        }
        soma = soma/vect.length;
        System.out.printf("MEDIA DO VETOR = %.3f\n", soma);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i]<soma){
                System.out.println(vect[i]);
            }
        }
    }
}
