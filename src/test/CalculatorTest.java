package test;

import domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // chamada para dois números inteiros
        System.out.println(calc.sum(3, 2)); // 5

        // chamada para três números inteiros
        System.out.println(calc.sum(3, 2, 6)); // 11

        // chamada para quatro números flutuantes
        System.out.println(calc.sum(1.5, 2.5, 5.5, 6.4)); // 15.9
    }
}