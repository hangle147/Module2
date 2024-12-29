package IO_Text_File.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryReader {
    public static void main(String[] args) {
        String filePath = "D:\\Codegym\\Module2\\src\\module2\\src\\IO_Text_File\\ReadFile\\country.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] countryData = line.split(",");

                System.out.println("ID: " + countryData[0] + ", Code: " + countryData[1] + ", Name: " + countryData[2]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
