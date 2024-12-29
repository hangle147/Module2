package MVC.Service.impl;

import MVC.Entity.Student;
import MVC.Repository.StudentRepository;
import MVC.Service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService{
    private static StudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(int id) {
        studentRepository.remove(id);
    }

    @Override
    public void update(int id, Student student) {

    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAllByName(String name) {
        return studentRepository.findAllByName(name);
    }
}
