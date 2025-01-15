package Object_oriented_programming;

abstract class motor {
    abstract void start();
}
class four extends motor {
    @Override
    void start() {
        System.out.println("Object_oriented_programming.Car");
    }
}
class two extends motor {
    @Override
    void start() {
        System.out.println("Bike");
    }
}
public class Override_car_example {
    public static void main(String[] args) {
        motor four = new four();
        motor two = new two();
        two.start();
        four.start();
    }
}