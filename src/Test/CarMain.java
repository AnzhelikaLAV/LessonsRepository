package Test;
public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", "Blue");

        myCar.startEngine();
        myCar.signal("Пи-пи-пи");
        myCar.stopEngine();
    }
}