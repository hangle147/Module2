package DSA_Stack_Queue.Demerging;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class EmployeeDemerger {
    public static void main(String[] args) {
        String inputFile = "D:\\Codegym\\Module2\\src\\module2\\src\\DSA_Stack_Queue\\Demerging\\employees.csv";
        String outputFile = "sorted_employees.csv";
        demergeEmployees(inputFile, outputFile);
    }

    public static void demergeEmployees(String inputFile, String outputFile) {
        Queue<Employee> NU = new LinkedList<>();
        Queue<Employee> NAM = new LinkedList<>();

        // Read data from file
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Employee emp = new Employee(parts[0].trim(), parts[1].trim(), parts[2].trim());
                    if (emp.gender.equalsIgnoreCase("Nữ")) {
                        NU.add(emp);
                    } else {
                        NAM.add(emp);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            while (!NU.isEmpty()) {
                bw.write(NU.poll().toString());
                bw.newLine();
            }
            while (!NAM.isEmpty()) {
                bw.write(NAM.poll().toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
