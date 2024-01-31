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
