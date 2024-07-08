package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalog {
    private Set<Product> productCatalog;

    public ProductCatalog() {
        this.productCatalog = new HashSet<>();
    }

    public void addProduct(long productCode, String name, double price, int quantity) {
        productCatalog.add(new Product(productCode, name, price, quantity));
    }


    public void showProducts() {
        System.out.println(productCatalog);
    }

    public Set<Product> orderProductsByName() {
        Set<Product> productsByName = new TreeSet<>(productCatalog);
        return productsByName;
    }

    public Set<Product> orderProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new PriceComparator());
        productsByPrice.addAll(productCatalog);
        return productsByPrice;

    }
}
