package Object_oriented_programming;

class student{
    public String name;
    student(String name){ 
        this.name = name;
    }
}
class Teacher{
    public String name;
    Teacher(String name){
        this.name = name;
    }
}
class Inheritance_classroom_example  {
    public static void main(String[] args) {
        Teacher t = new Teacher("Suresh");
        student s = new student("koti");
    }
}

