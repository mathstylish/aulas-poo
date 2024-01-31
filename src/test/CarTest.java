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

	System.out.println(car);
	System.out.println(car2);
    }
}
