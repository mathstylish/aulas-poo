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

    public Car(String name, String model, int year) {
        this(name, model); // chama o construtor B
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + ", model=" + model + ", year=" + year + "]";
    }
}
