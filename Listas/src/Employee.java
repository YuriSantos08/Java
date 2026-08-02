public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id , String name , Double salary){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void increasySalary (double percentage ) {

        salary+= salary * (percentage  / 100);
    }

    public  String toString () {

        return id + ", "+name+", "+String.format("%.2f",salary);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

}
