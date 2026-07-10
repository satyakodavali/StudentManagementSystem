package service;

import java.util.ArrayList;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    StudentDAO studentDAO = new StudentDAO();

    public void addStudent(Student student) throws Exception {
        studentDAO.addStudent(student);
    }

    public ArrayList<Student> viewAllStudents() throws Exception {
        return studentDAO.viewAllStudents();
    }

    public Student searchStudentById(int studentID) throws Exception {
        return studentDAO.searchStudentById(studentID);
    }

    public void updateStudent(Student student) throws Exception {
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(int studentID) throws Exception {
        studentDAO.deleteStudent(studentID);
    }
}