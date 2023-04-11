package Ex2;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Testing the Car no constructor\n");
        Car car = new Car();
        System.out.println(car.toString());

        System.out.println("Testing the Car multi-arg constructor: \n");
        Car car1 = new Car(100000, 4.5, 1.25, 2000, "Ferrari", "F2", 2, "dds");
        System.out.println(car1.toString());

        System.out.println("Testing the Bicycle no-arg constructor: \n");
        Bicycle by = new Bicycle();
        System.out.println(by.toString());

        System.out.println("Testing the Bicycle multi-arg constructor: \n");
        Bicycle by1 =  new Bicycle(500, 1.5, 1, 50 , "Raleigh", "Mountainbike", 4, true);
        System.out.println(by1.toString());
    }
}
