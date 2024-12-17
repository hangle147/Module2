package Java_Collection_Framework.UseArrayList;

import java.util.*;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Thêm mới thành công.");
    }

    public void updateProduct(int id, String name, double Price) {
        Scanner sc = new Scanner(System.in);
        for (Product product : products) {
            if (product.getId() == id) {
                String newName = sc.nextLine();
                product.setName(newName);
                double newPrice = sc.nextDouble();
                product.setPrice(newPrice);
                System.out.println("Cập nhật sản phẩm thành công.");
                return;
            }
        }
        System.out.println("Sản phẩm không tồn tại.");
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
        System.out.println("Xoá sản phẩm thành công.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sachs sản phẩm trống.");
        } else {
            System.out.printf("%-10s %-20s %-10s\n", "ID", "Tên sản phẩm", "Giá");
            System.out.println("--------------------------------------------");
            for (Product product : products) {
                System.out.printf("%-10d %-20s %-10.2f\n",
                        product.getId(),
                        product.getName(),
                        product.getPrice());
            }
        }
    }

    public void searchProducts(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                System.out.println(products);
                return;
            }
        }
        System.out.println("Sản phẩm không tồn tại.");
    }

    public void sortProducts(boolean ascending) {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        if (!ascending) {
            Collections.reverse(products);
        }
        System.out.println("Sắp xếp sản phẩm thành công.");
    }
}
