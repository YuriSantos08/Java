import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        double mediap , n1 , n2 , n3 ;
        for (int i=0;i<n;i++){
             n1 = sc.nextDouble();
             n2 = sc.nextDouble();
             n3 = sc.nextDouble();

             mediap = (n1*2+n2*3+n3*5) / 10;

            System.out.printf("%.1f%n",mediap);
        }
    }
}
