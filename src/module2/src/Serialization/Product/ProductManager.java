package Serialization.Product;

import java.io.*;

public class ProductManager {
    private static final String FILE_PATH = "D:\\Codegym\\Module2\\src\\module2\\src\\Serialization\\Product\\products.csv";

    // Thêm sản phẩm vào tệp
    public static void addProduct(Product product) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(product.toString());
            writer.newLine();
            System.out.println("Sản phẩm đã được thêm thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }

    // Hiển thị tất cả sản phẩm từ tệp
    public static void displayProducts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.split(",");
                System.out.println("Mã sản phẩm: " + productData[0] + ", Tên sản phẩm: " + productData[1] +
                        ", Giá: " + productData[2] + ", Hàng sản xuất: " + productData[3] + ", Mô tả: " + productData[4]);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc sản phẩm: " + e.getMessage());
        }
    }

    // Tìm kiếm sản phẩm theo mã sản phẩm
    public static void searchProduct(String productId) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.split(",");
                if (productData[0].equalsIgnoreCase(productId)) {
                    System.out.println("Sản phẩm tìm thấy: ");
                    System.out.println("Mã sản phẩm: " + productData[0] + ", Tên sản phẩm: " + productData[1] +
                            ", Giá: " + productData[2] + ", Hàng sản xuất: " + productData[3] + ", Mô tả: " + productData[4]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy sản phẩm với mã: " + productId);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi tìm kiếm sản phẩm: " + e.getMessage());
        }
    }
}
