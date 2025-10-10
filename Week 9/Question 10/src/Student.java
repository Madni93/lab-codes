public class Student {
    String rollNo;
    String name;
    int marks;
    static String schoolName = "AMU";

    Student(String rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public static void changeSchoolName(String Name){
        schoolName = Name;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("School name: "+schoolName);
    }


}
