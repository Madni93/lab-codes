class Employee {
    String empName;
    int empId;

    // Inner class for Salary
    class Salary {
        double basic, hra, pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("Salary Details:");
            System.out.println("  Basic: " + basic);
            System.out.println("  HRA: " + hra);
            System.out.println("  PF: " + pf);
        }
    }

    // Inner class for Joining Date
    class JoiningDate {
        int day, month, year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    // Instances of inner classes
    Salary salary;
    JoiningDate joiningDate;

    // Constructor for Employee
    Employee(String name, int id, double basic, double hra, double pf, int day, int month, int year) {
        empName = name;
        empId = id;
        salary = new Salary(basic, hra, pf);
        joiningDate = new JoiningDate(day, month, year);
    }

    // Method to display complete employee info
    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        salary.displaySalary();
        joiningDate.displayJoiningDate();
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee("Madni", 101, 30000, 5000, 2000, 12, 5, 2023);
        e1.displayEmployee();
    }
}

