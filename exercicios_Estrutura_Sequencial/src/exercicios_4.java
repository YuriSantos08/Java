import java.util.Locale;
import java.util.Scanner;

public class exercicios_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num , horas_trabalhadas;
        double v_horas , salario;

        System.out.println("Informe o numero do funcionario: ");
        num = sc.nextInt();
        System.out.println("Informe a horas trabalhadas: ");
        horas_trabalhadas = sc.nextInt();
        System.out.println("Informe o valor ganho em horas trabalhadas: ");
        v_horas = sc.nextDouble();

        salario = (double) horas_trabalhadas * v_horas;
        System.out.printf("O funcionario %d ganha um salario = %.2f", num, salario);
        sc.close();
    }
}
