package test;

import domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Volvo");
		Car car3 = new Car("Fiat", "Uno");
        Car car4 = new Car("Fusca", "Classic", 1990);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
