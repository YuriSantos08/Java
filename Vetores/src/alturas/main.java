package alturas;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n , menor = 0;
        double soma = 0;
        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf(" Dados da %d pessoa: ", i + 1 );
            System.out.println();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
            
        }
        
        for (int i = 0; i < pessoas.length; i++) {
            soma = soma + pessoas[i].getAltura();
        }
        double media = soma / pessoas.length;
        System.out.printf("Altura media: %.2f%n" , media);
        
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getIdade() < 16){
                 menor += 1;
            }
        }
        System.out.println(menor);
        double porcentagem = ((double) menor / pessoas.length) * 100.0;
            System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcentagem);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
}
}
