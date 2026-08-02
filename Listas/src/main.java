
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        int n;
        System.out.println("How many Employees will be resgisted? ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i < n; i++){

            System.out.print("Employee #" +(i+1) +": \n");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id,name,salary));
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        Employee emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id not exist! ");
            System.out.println();
            System.out.println("List of Employees: ");
            for (Employee x : list) {
                System.out.println(x.toString());
            }
        }else {
            emp.increasySalary(percentage);
            System.out.println("List of Employees: ");
            for (Employee x: list){
                System.out.println(x.toString());
            }
        }

    }
}
