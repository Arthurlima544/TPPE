package structural_patterns.composite;
public class Product implements Component{

    public String name;
    public double weight;
    public double price;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double calculate() {
        return price;
    }
}
