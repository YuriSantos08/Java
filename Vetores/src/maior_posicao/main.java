package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , posmaior = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double maior = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posmaior = i;
            }
        }
        System.out.println("Maior Valor: " + maior);
        System.out.println("Posiçao do maior: "+posmaior);
        sc.close();
    }
}
