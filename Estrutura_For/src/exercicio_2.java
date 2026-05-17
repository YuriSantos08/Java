import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (10 <= x && x <= 20) {
                in +=1;
            }else {
                 out +=1;
            }
        }
        System.out.println(in +" in");
        System.out.println(out +" out");
        sc.close();
    }
}
