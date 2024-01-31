# A classe Object
Em Java, todas as classes são implicitamente subtipos da classe `Object`. Isso significa que, por padrão, todas as classes herdam características e comportamentos da classe `Object`. A classe `Object` fornece métodos básicos que podem ser sobrescritos ou utilizados diretamente pelas classes derivadas.
## O método `toString()`
Uma dessas operações básicas é o método `toString()`. O método `toString()` está definido na classe `Object` como:
```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode()); // domain.Car@2d5e5f3
}
```
A representação padrão fornecida pelo método `toString()` inclui o nome da classe seguido pelo código hash hexadecimal do objeto. Essa representação padrão pode não ser muito informativa ou útil.

Ao sobrescrever o método `toString()` em uma classe derivada, você pode fornecer uma representação mais significativa e legível para o seu objeto. Isso é especialmente útil ao imprimir ou converter objetos para strings. A assinatura do método `toString()` é a seguinte:
```java
public String toString() {
    // Código para criar e retornar a representação da string desejada
}
```
Aqui está um exemplo de como você pode sobrescrever o método `toString()` na classe `Car` do exemplo anterior:
```java
package domain;

/* Representa a abstração de um carro
*
* @param name nome do carro
* @param model modelo do carro
* @param year ano de lançamento
*
* @return Um objeto do tipo carro com nome, modelo e ano de lançamento
*/
public  class  Car {
  // Atributos (características de um carro)
  public  String name;
  public  String model;
  public  int year;

  @Override
  public String toString() {
      return "Car [name=" + name + ", model=" + model + ", year=" + year + "]";
  }
}
```
A anotação `@Override` é usada para indicar que a intenção é sobrescrever um método da classe pai (`Object`, neste caso). Ao fazer isso, quando você chama `toString()` em uma instância da classe `Car`, você obtém a representação personalizada fornecida pelo método sobrescrito.
```java
package test;

import domain.Car;

public  class  CarTest {
  public  static  void  main(String[] args) {
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
```
Note que a chamada do método `toString()` é opcional, porque o método é invocado automaticamente. 
