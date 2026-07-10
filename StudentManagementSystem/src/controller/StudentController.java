package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Student;
import service.StudentService;

public class StudentController {

    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentService();

    public void addStudent() throws Exception {

        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student student = new Student(
                studentID,
                studentName,
                age,
                gender,
                department,
                email,
                phoneNumber,
                marks
        );

        studentService.addStudent(student);
    }

    public void viewAllStudents() throws Exception {

        ArrayList<Student> students = studentService.viewAllStudents();

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void searchStudentById() throws Exception {
        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();
        Student student = studentService.searchStudentById(studentID);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student Not Found.");
        }
    }
    public void updateStudent() throws Exception {
        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Student student = new Student(
                studentID,
                studentName,
                age,
                gender,
                department,
                email,
                phoneNumber,
                marks
        );

        studentService.updateStudent(student);
    }

    public void deleteStudent() throws Exception {

        System.out.print("Enter Student ID: ");
        int studentID = sc.nextInt();

        studentService.deleteStudent(studentID);
    }
    
}