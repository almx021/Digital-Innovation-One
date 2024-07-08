package Map.Pesquisa;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
    
        productCatalog.addProduct(1L, "P1", 10, 1);
        productCatalog.addProduct(2L, "P2", 11, 2);
        productCatalog.addProduct(3L, "P3", 12, 4);
        
        System.out.println(productCatalog.getCatalogTotalValue());
        
        System.out.println(productCatalog.getMostExpensiveProduct());

    }
}
