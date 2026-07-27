package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , posmaior = 0;
        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for(int i=0;i< pessoas.length;i++){
            System.out.printf("Dados da %d pessoa: \n", i+1);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa(nome,idade);
        }
        int maiorIdade = pessoas[0].getIdade();
        for (int i=0;i<pessoas.length;i++) {
            if (pessoas[i].getIdade() >maiorIdade ) {
                maiorIdade = pessoas[i].getIdade();
                posmaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+pessoas[posmaior].getNome());


        sc.close();
    }
}
