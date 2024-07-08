package Set.Ordenacao;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private long productCode;
    private String name;
    private double price;
    private int quantity;
    
    
    public Product(long productCode, String name, double price, int quantity) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public long getProductCode() {
        return productCode;
    }


    public void setProductCode(long productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product [productCode=" + productCode + ", name=" + name + ", price=" + price + ", quantity=" + quantity
                + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (productCode ^ (productCode >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productCode != other.productCode)
            return false;
        return true;
    }


    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }


}


class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
       return Double.compare(p1.getPrice(), p2.getPrice());
    }
    
}