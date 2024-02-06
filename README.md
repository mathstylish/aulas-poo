# Sobrecarga de métodos
Sobrecarga de métodos em Java refere-se a capacidade de termos múltiplos métodos com o mesmo nome, mas com assinaturas diferentes (quantidade de parâmetros ou tipos diferentes de dados).

Lembrando que assinatura de um método tem a seguinte estrutura (não vamos levar em conta modificadores de acesso ainda):
`<tipo-retorno> <nome> (<tipo-parametro><nome>, <tipo-parametro><nome>)`

Imagine uma classe que representa uma Calculadora e nela queremos ter um único método chamado `sum` que pode ter as seguintes sobrecargas:
- Somar dois números inteiros
- Somar três números inteiros
- Somar quatro números flutuantes

```java
public class Calculator {
  public int sum(int a, int b) {
    return a + b;
  }

  public int sum(int a, int b, int c) {
    return a + b + c;
  }

  public double sum(double a, double b, double c, double d) {
    return a + b + c + d;
  }
}
```
Repare que o nome do método continua sendo `sum`, porém o tipo de retorno, o tipo e a quantidade dos parâmetros mudaram.
Os métodos criados podem então, ser chamados a partir da instância de `Calculator` que foi criada:
```java
public class CalculatorTest {
  public static void main(String[] args) {
    Calculator calc = new Calculator();

    // chamada para dois números inteiros
    System.out.println(calc.sum(3, 2)); // 5

    // chamada para três números inteiros
    System.out.println(calc.sum(3, 2, 6)); // 12

    // chamada para quatro números flutuantes
    System.out.println(calc.sum(1.5, 2.5, 5.5, 6.4)); // 15.9
  }
}
```
Baseado na assinatura, a JVM sabe exatamente qual método chamar para realizar as operações. Pode não parecer algo que faça sentido utilizar, mas a API do Java tem inúmeros métodos sobrecarregados que serão vistos mais a frente.