# Métodos
Métodos em POO são usados para representar comportamentos e ações que objetos de uma classe específica podem realizar. Eles ajudam a encapsular a lógica de implementação associada aos objetos, proporcionando uma forma organizada de interação com as instâncias da classe.

A assinatura de um método inclui o tipo de retorno, o nome do método e, opcionalmente, parâmetros.
```java
public void accelerate(int speed) {
    System.out.println("Vroom! The car is accelerating to " + speed);
}
```
Aqui está um exemplo de métodos que podemos criar na classe `Car` dos exemplos anteriores:
```java
package domain;

/**
 * Representa a abstração de um carro
 * 
 * @param name  nome do carro
 * @param model modelo do carro
 * @param year  ano de lançamento
 * 
 * @return Um objeto do tipo carro com nome, modelo e ano de lançamento
 */
public class Car {
  // Atributos (características de um carro)
  public String name;
  public String model;
  public int year;

  public void start(String name) {
    System.out.println("Turning on the " + name + "!!");
  }

  public void accelerate(String name, int speed) {
    System.out.println("Vroom! The car " + name + " is accelerating to " + speed);
  }

  @Override
  public String toString() {
    return "Car [name=" + name + ", model=" + model + ", year=" + year + "]";
  }
}
```
Os métodos criados podem então, ser chamados a partir das instâncias de `Car` que foram criadas:
```java
package test.test;

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
```
