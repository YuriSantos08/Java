import java.util.Locale;
import java.util.Scanner;

public class excercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int senha;
        senha = 0;

        while(senha != 2002){
            System.out.println("Senha Invalida!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}
