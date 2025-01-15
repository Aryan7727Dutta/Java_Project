package Object_oriented_programming;

class Vehicle {
    public void move() {
        System.out.println("This vehicle moves");
    }
}

class Car extends Vehicle {
    public void fuelType() {
        System.out.println("This car runs on petrol");
    }
}

public class Interface_car_example {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.fuelType();
        car.move();
    }
}