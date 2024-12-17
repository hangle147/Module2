package Java_Collection_Framework.UseArrayList;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Thông tin sản phẩm (ID: " + id + ", Tên sản phẩm: " + name + ", Giá: " + price + ")";
    }
}
