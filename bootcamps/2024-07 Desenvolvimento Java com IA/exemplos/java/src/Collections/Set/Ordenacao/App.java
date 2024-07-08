package Set.Ordenacao;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct(2, "t2", 3.5, 20);
        productCatalog.addProduct(6, "g2", 3.55, 27);
        productCatalog.addProduct(4, "g2", 85, 24);
        productCatalog.addProduct(1, "t1", 0.5,22);
        productCatalog.addProduct(1, "d3", 4.5, 1);

        System.out.println(productCatalog.orderProductsByName());

        System.out.println(productCatalog.orderProductsByPrice());
    }
}
