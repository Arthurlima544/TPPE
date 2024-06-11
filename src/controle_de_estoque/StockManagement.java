package controle_de_estoque;

import java.util.List;

public class StockManagement {
    public List<Product> stockProducts;

    public Boolean addNewProductToStock(Product product){
        if(stockProducts.contains(product)){
            return false;
        }
        stockProducts.add(product);
        return true;
        
    }
    public Boolean changeStockProductQuantity(Product oldProduct, int newQuantity){
        if(!stockProducts.contains(oldProduct)){
            return false;
        }
        stockProducts.remove(oldProduct);
        stockProducts.add(oldProduct);
        return true;
    }
}
