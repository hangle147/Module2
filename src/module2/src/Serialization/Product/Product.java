package Serialization.Product;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String productId, String productName, double price, String manufacturer, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    @Override
    public String toString() {
        return productId + "," + productName + "," + price + "," + manufacturer + "," + description;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
