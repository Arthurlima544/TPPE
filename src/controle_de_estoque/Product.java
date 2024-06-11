package controle_de_estoque;

import java.util.Optional;

public class Product {
    private String name;
    private int validity;
    private int quantity;
    private double price;
    private double weight;

    public Product(String name, int validity, int quantity, double price, double weight) {
        this.name = name;
        this.validity = validity;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }
    
    public Product copyWith(Optional<String> name, Optional<Integer> validity, Optional<Integer> quantity, Optional<Double> price, Optional<Double> weight){
        return new Product(
            name.isPresent() ? name.get() : this.name,
            validity.isPresent() ? validity.get() : this.validity,
            quantity.isPresent() ? quantity.get() : this.quantity,
            price.isPresent() ? price.get() : this.price,
            weight.isPresent() ? weight.get() : this.weight
        );
    }
}
