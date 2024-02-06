# Construtores
Em Java, um construtor é um método especial utilizado para inicializar instâncias de objetos. Ele é chamado automaticamente quando um objeto é instanciado. Construtores tem o mesmo nome da classe e não possuem tipo de retorno.

## Construtor padrão
O construtor padrão, ou vazio, é aquele que não aceita nenhum parâmetro. Se você não fornecer um explicitamente um construtor para a classe, a JVM irá criar automaticamente um construtor sem parâmetros. Você pode visualizar o código gerado em uma pasta chamada `target` caso ela esteja visível para você.

```java
public class Car {
  public String name;
  public String model;
  public int year;

  public Car() {} // Construtor vazio

  // outros métodos
  // toString
}
```
## Criando explicitamente um construtor
Assim como um método sobrecarregado, é possível sobrecarregar construtores com tipos e/ou quantidade de parâmetros diferentes. A JVM saberá, assim como um método sobrecarregado comum, qual construtor chamar.

Se o nome do parâmetro for o mesmo do atributo da classe, que é o cenário mais comum, precisamos usar a palavra-chave `this` que é a classe em sí e então especificar que queremos o atributo da classe e não o parâmetro, resolvendo o conflito de nomes iguais.
```java
public class Car {
  public String name;
  public String model;
  public int year;

  // Construtor sobrecarregado
  public Car(String name, String model, int year) {
    this.name = name;
    this.model = model;
    this.year = year;
  }

  // outros métodos
  // toString
}
```
Então podemos mudar a forma que conhecemos até agora de inicialização, que é `<objeto>.<atributo> = <valor>` pela inicialização direta no construtor.
```java
public class CarTest {
  public static void main(String[] args) {
    Car car1 = new Car("Volvo", "v40", 2013);
    Car car2 = new Car("Fiat", "Uno", 1996);

    System.out.println(car1);
    System.out.println(car2);
  }
}
```
É importante lembrar que ao sobrecarregar o construtor padrão de uma classe, você perde a possibilidade de usar o construtor padrão porque a JVM não vai mais criar. Nesse caso você precisa criá-lo explicitamente.
```java
public class Car {
  public String name;
  public String model;
  public int year;

  public Car() {} // Construtor vazio

  // Construtor sobrecarregado
  public Car(String name, String model, int year) {
    this.name = name;
    this.model = model;
    this.year = year;
  }

  // outros métodos
  // toString
}
```
Também é importante ressaltar que o fato do construtor ser vazio, não impossibilita de ser realizada alguma lógica dentro dele.
```java
public class Car {
  public String name;
  public String model;
  public int year;

  public Car() { // Construtor vazio
    System.out.print("Hello");
  }

  // outros métodos
  // toString
}
```
O código dentro do construtor será executado na sua chamada sem problemas.
## Preciso repetir parâmetros sempre que sobrecarregar o construtor?
Não, podemos criar construtores com assinaturas diferentes mas reutilizar o código de inicialização de outro construtor.

Lembra que a palavra-chave `this` representa a classe? Então `this()` seria o construtor vazio dessa classe. A JVM continua sabendo quem chamar graças a assinatura.
```java
public class Car {
  public String name;
  public String model;
  public int year;

  public Car() {
    System.out.println("Construtor Vazio");
  }

  // Construtor A (só o nome)
  public Car(String name) {
    this(); // chama o construtor vazio
    this.name = name;
  }

  // Construtor B (nome e modelo)
  public Car(String name, String model) {
    this(name); // chama o construtor A
    this.model = model;
  }

  // Construtor C (nome, modelo e ano)
  public Car(String name, String model, int year) {
    this(name, model); // chama o construtor B
    this.year = year;
  }

  // outros métodos
  // toString
}
```
Então agora temos 4 formas de inicializar um objeto `Car`
- Vazio
- Somente nome
- Nome e modelo
- Nome modelo e ano

```java
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
```

Note que o construtor vazio vai ser chamado em todas as inicializações, porque os construtores executam o código dos outros construtores, para reaproveitar a inicialização. Além disso, os atributos que não foram inicializados em construtores que não recebem todos os atributos da classe, terão o valor de inicialização padrão, nesse caso, `null` para String e `0` para inteiros.