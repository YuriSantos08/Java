import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A , B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double area_triangulo = (A * C) / 2;
        double area_circulo = Math.PI * Math.pow(C, 2) ;
        double area_trapezio = ((A + B) * C) / 2;
        double area_quadrado = Math.pow(B,2);
        double area_retangulo = A * B;

        System.out.printf("Triangulo = %.3f%n", area_triangulo);
        System.out.printf("Circulo = %.3f%n", area_circulo);
        System.out.printf("Trapezio = %.3f%n", area_trapezio);
        System.out.printf("Quadrado = %.3f%n", area_quadrado);
        System.out.printf("Retangulo = %.3f%n", area_retangulo);

        sc.close();
    }
}
