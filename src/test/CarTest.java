package test;

import domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
		Car car2 = new Car();
		
		car.name = "Fusca";
		car.model = "Classico";
		car.year = 1968;
		
		car2.name = "Tesla";
		car2.model = "Model S";
		car2.year = 2012;

        car.start(car.name);
        car.accelerate(car.name, 50);

        car2.start(car2.name);
        car2.accelerate(car2.name, 50);
    }
}
