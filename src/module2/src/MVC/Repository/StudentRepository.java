package MVC.Repository;

import MVC.Entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> findAll() {
        File file = new File("MVC/data/student.csv");
        List<Student> students = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                ) {
            String line;
            String[] temp;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]));
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return students;
    }

    public List<Student> findAllByName(String name) {
        List<Student> result = new ArrayList<>();
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void save(Student student) {
        File file = new File("MVC/data/student.csv");
        List<Student> students = new ArrayList<>();
        students.add(student);
        writeFile(students, true);
    }

    private String studentToString(Student student) {
        return student.getCode() + "," + student.getName() + "," + student.getAddress() + "," + student.getPoint();
    }

    public Student findById(int id) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getCode() == id) {
                return student;
            }
        }
        return null;
    }

    public void remove(int id) {
        List<Student> students = findAll();
        for (Student student : students) {
            if (student.getCode() == id) {
                students.remove(student);
                break;
            }
        }
        writeFile(students, false);
    }

    public void writeFile(List<Student> students, boolean append) {
        File file = new File("MVC/data/student.csv");
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (Student student : students) {
                bufferedWriter.write(studentToString(student));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }
}
