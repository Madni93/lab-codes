public class Main {
    static void main() {
        Student s = new Student("504","Madni",100);
        s.display();
        Student.changeSchoolName("DU");
        System.out.println("--------After changing Details--------");
        s.display();
    }
}
