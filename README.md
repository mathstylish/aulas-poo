# Programação Orientada a Objetos
## Definição
A programação orientada a objetos (POO) é um paradigma de programação que organiza o código em torno de objetos, que representam instâncias concretas ou abstrações do mundo real. Esses objetos têm características (atributos) e comportamentos (métodos) associados a eles. A ideia fundamental da POO é modelar o sistema de software de maneira semelhante à forma como percebemos e interagimos com objetos no mundo real.
## Classe
Uma classe é um modelo ou um plano para criar objetos. Define os atributos e métodos que os objetos terão.
## Objeto
Um objeto é uma instância de uma classe. Pode ser uma entidade concreta ou abstrata que possui características (atributos) e comportamentos (métodos).
## Analogia
**Classe:** Imagine que "Carro" seja uma classe. Ela define as características (atributos) e comportamentos (métodos) que todos os carros devem ter. A classe não é um carro específico, mas um modelo que descreve o que é um carro.

**Objeto:** Agora, imagine que você tem um carro específico, por exemplo, um "Carro Vermelho". Esse é um objeto, uma instância da classe "Carro". Ele possui características específicas, como cor, modelo, ano, e pode realizar ações como ligar, acelerar e frear.
## Exemplo de classe em Java
```java
package domain;

/**
* Representa o molde de um carro X
*
* @param name nome do carro
* @param model modelo do carro
* @param year ano de lançamento
*
* @return Um objeto do tipo carro com nome, modelo e ano de lançamento
*/

public  class  Car {
	// Atributos (caracteristicas de um carro)
	public  String name;
	public  String model;
	public  int year;
}
```
## Exemplo de Objeto
```java
package test.test;
  
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

		System.out.println(car.name);
		System.out.println(car.model);
		System.out.println(car.year);
		
		System.out.println(car2.name);
		System.out.println(car2.model);
		System.out.println(car2.year);
	}
}
```