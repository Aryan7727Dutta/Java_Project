package Object_oriented_programming;

public interface Dog{
    String sleep(int a);

}

class Interface_example{
    public static void main(String[] args) {
        Dog obj = (a)-> a+" hours";
        System.out.println(obj.sleep(11));


    }
}