package Java_Collection_Framework.Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "Product A", 1000));
        manager.addProduct(new Product(2, "Product B", 2000));
        manager.addProduct(new Product(3, "Product C", 1500));

        System.out.println("Danh sách sản phẩm:");
        manager.showProducts();

        System.out.println("\nTìm kiếm sản phẩm có tên 'Product A':");
        manager.searchProductByName("Product A");

        System.out.println("\nSửa sản phẩm có id 1:");
        manager.updateProduct(1, "Updated Product A", 1200);
        manager.showProducts();

        System.out.println("\nXóa sản phẩm có id 2:");
        manager.deleteProduct(2);
        manager.showProducts();

        System.out.println("\nSắp xếp sản phẩm theo giá tăng dần:");
        manager.sortProductsByPriceAscending();
        manager.showProducts();

        System.out.println("\nSắp xếp sản phẩm theo giá giảm dần:");
        manager.sortProductsByPriceDescending();
        manager.showProducts();
    }
}
