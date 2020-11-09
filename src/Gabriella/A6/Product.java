package Gabriella.A6;

public class Product {

  protected String name;
  protected String description;
  protected double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        ElectronicBook EB1= new ElectronicBook("Agile Java programming for beginners",
                "blalanalbalabala",69.90d,"das ist ein URL");

        System.out.println(EB1);


    }


}
