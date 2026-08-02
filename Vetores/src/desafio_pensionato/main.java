package desafio_pensionato;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();
        Hospede[] hospede = new Hospede[10];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent %d#: %n", i + 1);
            System.out.print("Name:  ");
            String name = sc.nextLine();
            System.out.print("E-mail:  ");
            String email = sc.nextLine();
            System.out.print("Room:  ");
            int numb = sc.nextInt();
            hospede[numb] = new Hospede(name, email);
        }
        for (int i = 0; i < hospede.length; i++) {
            if (hospede[i] != null) {
                System.out.println(i + ": " + hospede[i].nome + " , " + hospede[i].email);
            }
        }
    }
}
