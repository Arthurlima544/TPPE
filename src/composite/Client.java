package composite;

public class Client {
    public static void main(String[] args) throws Exception {
        Box greaterBox = new Box();
        Box mediumBox = new Box();
        Box smallBox = new Box();
        Box smallBox2 = new Box();
        smallBox2.add( new Product("Phone", 1000, 0.1) );
        smallBox.add( new Product("Ear buds", 100, 1) );
        mediumBox.add( smallBox);
        mediumBox.add( new Product("Hammer", 4, 2) );
        greaterBox.add(mediumBox);
        greaterBox.add( new Product("Key", 2, 0.1) );
        greaterBox.add(smallBox2);

        System.out.println("Total price: " + greaterBox.calculate());
    }
}
