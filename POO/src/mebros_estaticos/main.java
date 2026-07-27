package mebros_estaticos;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        // scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // exercicio membros estaticos
        System.out.print("What is the dollar price?");
        double valueDolar = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        double quantityDolar = sc.nextDouble();

        System.out.printf("%.2f%n",CurrencyConverter.PayDolar(valueDolar, quantityDolar));




        sc.close();
    }
}
