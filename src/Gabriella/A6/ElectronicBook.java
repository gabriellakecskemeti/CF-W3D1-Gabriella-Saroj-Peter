package Gabriella.A6;

public class ElectronicBook extends Book{

    private String url;

    public ElectronicBook(String name, String description, double price, String url) {
        super(name, description, price);
        this.url = url;
    }

    @Override
    public String toString() {
        return "ElectronicBook{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
