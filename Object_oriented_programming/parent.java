package Object_oriented_programming;

class Person {
    public void Details() {
        System.out.println("person");

    }
}
class Student extends Person {
    @Override
    public void Details() {
        System.out.println("Object_oriented_programming.student");
    }
    public void showBothDetails() {
        super.Details();
        this.Details();
    }
}
public class parent {
    public static void main(String[] args) {
        Student student = new Student();
        student.showBothDetails();

    }
}