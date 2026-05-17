import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        double area = Math.pow(raio , 2) * pi ;

        System.out.printf("Area = %.4f", area );
        sc.close();
    }
}
