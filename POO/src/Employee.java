public class Employee {

    String name;
    double tax;
    double salary;

    public double NetSalary () {
        return salary - tax;
    }
    
    public void IncreaseSalary (double percentage) {
        salary += salary * percentage / 100.0;
    }

}
