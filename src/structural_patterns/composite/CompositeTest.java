package structural_patterns.composite;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testAddNewBox(){
        Box box = new Box();
        box.add(new Product("Cup", 10, 0.2));
        box.add(new Product("Card", 20, 0));
        
        assertEquals(box.getChildren().size(), 2);
    }

    @Test
    public void testRemoveBox(){
        //Arrange
        Box box = new Box();
        Product product = new Product("Cup", 10, 0.2);
        //Act 
        box.add(product);
        box.remove(product);
        // Assert
        assertEquals(box.getChildren().size(), 0);
    }

    @Test
    public void testGetChildren(){
        //Arrange
        Box box = new Box();
        Product product = new Product("Cup", 10, 0.2);
        Product product2 = new Product("Card", 20, 0);
        //Act 
        box.add(product);
        box.add(product2);
        // Assert
        assertEquals(box.getChildren().get(0), product);
        assertEquals(box.getChildren().get(1), product2);
        assertEquals(box.getChildren().size(), 2);
    }

    @Test
    public void testCalculate(){
        //Arrange
        Box greaterBox = new Box();
        Box mediumBox = new Box();
        Box smallBox = new Box();
        Box smallBox2 = new Box();
        //Act
        smallBox2.add( new Product("Phone", 1000, 0.1) );
        smallBox.add( new Product("Ear buds", 100, 1) );
        mediumBox.add( smallBox);
        mediumBox.add( new Product("Hammer", 4, 2) );
        greaterBox.add(mediumBox);
        greaterBox.add( new Product("Key", 2, 0.1) );
        greaterBox.add(smallBox2);
        //Assert
        assertEquals(greaterBox.calculate(), 1106.1, 0.1);
        //! o O parâmetro delta é usado para lidar com 
        //! a precisão limitada das representações de 
        //! números de ponto flutuante em computadores
        //! no caso acima aceitamos os valores entre 1106.0 e 1106.2
        //! Para comparar com exatidão podemos usar o BigDecimal
        /* 
        BigDecimal total = BigDecimal.valueOf(greaterBox.calculate());
        BigDecimal expected = BigDecimal.valueOf(1106.0);
        assertEquals(total, expected); 
        */
    }

}
