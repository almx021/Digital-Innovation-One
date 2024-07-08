package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Long, Product> productCatalog;

    public ProductCatalog() {
        this.productCatalog = new HashMap<>();
    }

    public void addProduct(Long code, String name, double price, int quantity) {
        productCatalog.put(code, new Product(name, price, quantity));
    }

    public void showProducts() {
        System.out.println(productCatalog);
    }

    public double getCatalogTotalValue() {
        double totalValue = 0d;

        if (!productCatalog.isEmpty()) {
            for (Product p : productCatalog.values()) {
                totalValue += p.getPrice() * p.getQuantity();
            }
        }
        return totalValue;
    }


    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;

        if (!productCatalog.isEmpty()) {
            for (Product p : productCatalog.values()) {
                if (p.getPrice() > highestPrice) {
                    mostExpensiveProduct = p;
                }
            }
        }
        return mostExpensiveProduct;
    }
}
