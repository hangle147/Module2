package Serialization.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String productId = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String productName = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();  // Xử lý dòng trống
                    System.out.print("Nhập hàng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả sản phẩm: ");
                    String description = scanner.nextLine();

                    Product newProduct = new Product(productId, productName, price, manufacturer, description);
                    manager.addProduct(newProduct);
                    break;

                case 2:
                    System.out.println("Danh sách các sản phẩm:");
                    manager.displayProducts();
                    break;

                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    String searchId = scanner.nextLine();
                    manager.searchProduct(searchId);
                    break;

                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
