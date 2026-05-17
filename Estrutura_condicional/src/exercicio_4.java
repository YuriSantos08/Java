import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora_inicial, hora_final;

        hora_inicial = sc.nextInt();
        hora_final = sc.nextInt();

        int duracao;
        if (hora_inicial < hora_final) {
            duracao = hora_final - hora_inicial;
        } else {
            duracao = 24 - hora_inicial + hora_final;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
