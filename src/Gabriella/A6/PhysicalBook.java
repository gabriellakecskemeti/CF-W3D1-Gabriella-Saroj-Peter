package Gabriella.A6;

public class PhysicalBook extends Book{

    protected double weight;  // in kg

    public PhysicalBook(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "PhysicalBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
