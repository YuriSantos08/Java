import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {

        // scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // instanciar o objeto
        Rectangule rectangle = new Rectangule();
        Employee func1 = new Employee();
        Aluno student = new Aluno();

        // exerecicio 1
        System.out.println("Enter rectangle width and height: ");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n" , rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n" , rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n" , rectangle.Diagonal());

        sc.nextLine();
        //exercicio 2
        System.out.print("Name: ");
        func1.name = sc.nextLine();

        System.out.print("Salary: ");
        func1.salary = sc.nextDouble();

        System.out.print("Tax: ");
        func1.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", func1.name, func1.NetSalary());
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func1.IncreaseSalary(percentage);
        System.out.printf("Update data: %s, $ %.2f%n", func1.name ,func1.NetSalary());

        sc.nextLine();

         
        //exercicio 3

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();
        System.out.printf("FINAL GRADE = %.2f%n", student.NotaFinal());
        student.Resultado();

        // exercicio membros estaticos

        sc.close();
    }
}
