package Gabriella.A6;

public class Book extends Product{

    public Book(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
