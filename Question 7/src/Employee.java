public class Employee {
    String empName;
    String empId;

    Employee(String empName,String empId){
        this.empName = empName;
        this.empId = empId;
    }

    class Salary{
        double basic;
        double hra;
        double pf;

        Salary(double basic, double hra, double pf){
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary(){
            System.out.println("Basic salary: "+basic);
            System.out.println("HRA: "+hra);
            System.out.println("pf: "+pf);
        }
    }

    class JoiningDate{
        int day;
        int month;
        int year;

        JoiningDate(int day,int month,int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate(){
            System.out.println("Day: "+day);
            System.out.println("Month: "+month);
            System.out.println("Year: "+year);
        }
    }

    void displayEmployee(){
        System.out.println("Name: "+empName);
        System.out.println("ID: "+empId);

        Salary s = new Salary(50000,4,20);
        s.displaySalary();

        JoiningDate j = new JoiningDate(20,4,2015);
        j.displayJoiningDate();
    }
}
