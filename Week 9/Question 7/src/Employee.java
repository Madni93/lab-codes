public class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    void showDetails(){
        System.out.println("Name of employee: " + name);
        System.out.println("Salary of employee is: " + salary);
    }
}
