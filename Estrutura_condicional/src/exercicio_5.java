import java.util.Scanner;
import java.util.Locale;

public class exercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo , quantidade;
        double preco;

        System.out.println("Digite o codigo do produto: ");
        codigo = sc.nextInt();
         if(codigo == 1){
             preco = 4.00;
             System.out.println("Informe a quantidade de cachorro-quente: ");
             quantidade = sc.nextInt();
             double valor = preco * quantidade;
             System.out.println("Total: R$ " + valor);
         }else if(codigo == 2){
             preco = 4.50;
             System.out.println("Informe a quantidade de X-Salada: ");
             quantidade = sc.nextInt();
             double valor = preco * quantidade;
             System.out.println("Total: R$ " + valor);
         }else if(codigo == 3){
             preco = 5.00;
             System.out.println("Informe a quantidade do X-Bacon: ");
             quantidade = sc.nextInt();
             double valor = preco * quantidade;
             System.out.println("Total: R$ " + valor);
         }else if(codigo == 4){
             preco = 2.00;
             System.out.println("Informe a quantidade de Torrada simples: ");
             quantidade = sc.nextInt();
             double valor = preco * quantidade;
             System.out.println("Total: R$ " + valor);
         }else if(codigo == 5){
             preco = 1.50;
             System.out.println("Informe a quantidade de refrigerante: ");
             quantidade = sc.nextInt();
             double valor = preco * quantidade;
             System.out.println("Total: R$ " + valor);
         }else {
             System.out.println("codigo invalido");
         }
    }
}
