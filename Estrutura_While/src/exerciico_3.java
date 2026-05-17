import java.util.Scanner;

public class exerciico_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0 , diesel = 0 ;
        int x = 0;


        while(x != 4) {
            x = sc.nextInt();
            if (x == 1) {
                alcool += 1;
            } else if (x == 2) {
                gasolina += 1;
            } else if (x == 3) {
                diesel += 1;
            }
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}
