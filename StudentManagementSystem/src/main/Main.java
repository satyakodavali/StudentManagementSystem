package main;
import controller.StudentController;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();
        int choice;
        do {
            System.out.println("\n========== Student Management System ==========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student By ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    studentController.addStudent();
                    break;

                case 2:
                    studentController.viewAllStudents();
                    break;

                case 3:
                    studentController.searchStudentById();
                    break;

                case 4:
                    studentController.updateStudent();
                    break;

                case 5:
                    studentController.deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you for using Student Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}