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

		System.out.println(car.name);
		System.out.println(car.model);
		System.out.println(car.year);
		
		System.out.println(car2.name);
		System.out.println(car2.model);
		System.out.println(car2.year);
    }
}
