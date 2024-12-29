package MVC.Controller;

import MVC.Entity.Student;
import MVC.Service.IStudentService;
import MVC.Service.impl.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService studentService = new StudentService();
    public List<Student> getAll() {
        return studentService.getAll();
    }

    public List<Student> findAllByName(String name) {
        return studentService.findAllByName(name);
    }

    public void save(Student student) {
        studentService.save(student);
    }

    public Student findById(int code) {
        return studentService.findById(code);
    }

    public void remove(int code) {
        studentService.remove(code);
    }
}
