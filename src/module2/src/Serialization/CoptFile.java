package Serialization;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CoptFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tập tin nguồn: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Nhập đường dẫn tập tin đích: ");
        String targetFile = scanner.nextLine();

        File source = new File(sourceFile);
        File target = new File(targetFile);

        if (!source.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        if (target.exists()) {
            System.out.println("Tệp đích đã tồn tại.");
            return;
        }

        try (FileReader fileReader = new FileReader(source);
             FileWriter fileWriter = new FileWriter(target)) {

            int character;
            int count = 0;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                count++;
            }

            System.out.println("Tệp được sao chép thành công.");
            System.out.println("Số ký tự được sao chép: " + count);

        } catch (IOException e) {
            System.out.println("Xảy ra lỗi trong quá trình sao chép tệp");
        }
    }
}
