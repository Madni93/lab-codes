public class Person {
    String name;
    String phone;

    Person(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

    class Address{
        String house_no;
        String street;
        String city;
        String state;

        Address(String house_no, String street, String city, String state){
            this.house_no = house_no;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayAddr(){
            System.out.println("House_no: "+house_no);
            System.out.println("Street: "+street);
            System.out.println("City: "+city);
            System.out.println("State: "+state);
        }

    }

    class DateOfBirth{
        int day;
        String month;
        int year;

        DateOfBirth(int day,String month,int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDOB(){
            System.out.println("Day: "+day);
            System.out.println("Month: "+month);
            System.out.println("Year: "+year);
        }
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Phone number: "+phone);

        System.out.println("------Address--------");

        Address a = new Address("5","Jamalpur","Aligarh","UP");
        a.displayAddr();

        System.out.println("------DOB--------");

        DateOfBirth d = new DateOfBirth(20,"April",2005);
        d.displayDOB();
    }

}
