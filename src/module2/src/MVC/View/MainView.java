package MVC.View;

import MVC.Controller.StudentController;
import MVC.Entity.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----Chương trình quản lí-----");
            System.out.println("1, Quản lí học sinh");
            System.out.println("2, Quản lí giáo viên");
            System.out.println("3, Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = getChoice(sc);
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Người dùng nhập sai, vui lòng nhập lại");
            }
        }
    }

    public static void menuStudent() {
        StudentController studentController = new StudentController();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----Quản lí học sinh-----");
            System.out.println("1, Thêm học sinh");
            System.out.println("2, Hiển thị danh sách");
            System.out.println("3, Xoá học sinh");
            System.out.println("4. Tìm kiếm học sinh theo tên");
            System.out.println("5, Quay lại menu chính");
            System.out.print("Mời bạn nhập lựa chọn: ");

            List<Student> students;
            int choice = getChoice(sc);
            switch (choice) {
                case 1:
                    Student student = inputStudent(sc);
                    studentController.save(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    students = studentController.getAll();
                    printStudentsTable(students);
                    break;
                case 3:
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    int code = Integer.parseInt(sc.nextLine());
                    deleteStudents(studentController, code);
                    break;
                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String nameStudent = sc.nextLine();
                    students = studentController.findAllByName(nameStudent);
                    for (Student temp : students) {
                        System.out.println(temp);
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Người dùng nhập sai, vui lòng nhập lại");
            }
        }
    }

    public static void deleteStudents(StudentController studentController, int code) {
        Scanner sc = new Scanner(System.in);
        Student student;
        student = studentController.findById(code);
        if (student == null) {
            System.out.println("Không tìm thấy đối tượng cần xoá");
        } else {
            System.out.println("Thông tin của học sinh: " + student);
            System.out.println("Chắc chắn xoá? (Y/N)");
            char confirm = sc.nextLine().charAt(0);
            if (confirm == 'y') {
                studentController.remove(code);
                System.out.println("Xoá thành công");
            }
        }
    }

    public static int getChoice(Scanner sc) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Người dùng nhập không đúng, nhập lại");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định");
            }
        }
        return choice;
    }

    private static void printStudentsTable(List<Student> students) {
        System.out.println("+------+----------------------+----------------------+--------+");
        System.out.println("| Code | Name                 | Address              | Point  |");
        System.out.println("+------+----------------------+----------------------+--------+");
        for (Student temp : students) {
            System.out.println(temp);
        }
        System.out.println("+------+----------------------+----------------------+--------+");
    }

    public static Student inputStudent(Scanner sc) {
        System.out.print("Nhập mã học sinh: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên học sinh: ");
        String name = sc.nextLine();
        String regex = "^[A-Z]{1}[a-z ]+$";
        while(!name.trim().matches(regex)) {
            System.out.println("Tên không đúng định dạng");
            System.out.print("Nhập lại tên học sinh:");
            name = sc.nextLine();
        }
        System.out.print("Nhập địa chỉ học sinh: ");
        String address = sc.nextLine();
        System.out.print("Nhập điểm học sinh: ");
        double points = Double.parseDouble(sc.nextLine());
        Student student = new Student(code, name, address, points);
        return student;
    }
}