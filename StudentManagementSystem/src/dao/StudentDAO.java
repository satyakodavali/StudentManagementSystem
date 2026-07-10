package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Student;
import util.DBConnection;
public class StudentDAO {
    public void addStudent(Student student) throws Exception{
        // DBConnection dbConnection = new DBConnection();
        Connection con =DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");
        ps.setInt(1,student.getStudentID());
        ps.setString(2,student.getStudentName());
        ps.setInt(3,student.getAge());
        ps.setString(4,String.valueOf(student.getGender()));
        ps.setString(5,student.getDepartment());
        ps.setString(6,student.getEmail());
        ps.setLong(7, student.getPhoneNumber());
        ps.setInt(8,student.getMarks());
        int i =ps.executeUpdate();
        if(i>0){
            System.out.println("Insertion succesful");
        }
        else{
            System.out.println("Insertion Failed");
        }
        // System.out.println(i);
    }
    public ArrayList<Student> viewAllStudents()throws Exception{
         ArrayList<Student> al = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("select * from student");
        ResultSet rs =ps.executeQuery();
        while(rs.next()){
              int studentID = rs.getInt("studentID");
              String studentName = rs.getString("studentName");
              int age = rs.getInt("age");
              char gender = rs.getString("gender").charAt(0);
              String department = rs.getString("department");
              String email = rs.getString("email");
              long phoneNumber = rs.getLong("phoneNumber");
              int marks = rs.getInt("marks");
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
al.add(student);

        }
        rs.close();
        ps.close();
        con.close();
        return al;
      
    }
    
    public Student searchStudentById(int studentID)throws Exception{
         Connection con = DBConnection.getConnection();
         PreparedStatement ps =con.prepareStatement("SELECT * FROM student WHERE studentID = ?");
         ps.setInt(1,studentID);
         ResultSet rs= ps.executeQuery();
          Student student = null;
         if(rs.next()){
            String studentName = rs.getString("studentName");
              int age = rs.getInt("age");
              char gender = rs.getString("gender").charAt(0);
              String department = rs.getString("department");
              String email = rs.getString("email");
              long phoneNumber = rs.getLong("phoneNumber");
              int marks = rs.getInt("marks");
              student = new Student(
    studentID,
    studentName,
    age,
    gender,
    department,
    email,
    phoneNumber,
    marks
);
         }
            rs.close();
    ps.close();
    con.close();

    return student;
    }
   public void updateStudent(Student student) throws Exception {

    Connection con = DBConnection.getConnection();

    PreparedStatement ps = con.prepareStatement(
        "UPDATE student SET studentName=?, age=?, gender=?, department=?, email=?, phoneNumber=?, marks=? WHERE studentID=?"
    );

    ps.setString(1, student.getStudentName());
    ps.setInt(2, student.getAge());
    ps.setString(3, String.valueOf(student.getGender()));
    ps.setString(4, student.getDepartment());
    ps.setString(5, student.getEmail());
    ps.setLong(6, student.getPhoneNumber());
    ps.setInt(7, student.getMarks());
    ps.setInt(8, student.getStudentID());

    int rows = ps.executeUpdate();

    if (rows > 0) {
        System.out.println("Student Updated Successfully");
    } else {
        System.out.println("Student Not Found");
    }

    ps.close();
    con.close();
}
    public void deleteStudent(int studentID) throws Exception {

    Connection con = DBConnection.getConnection();

    PreparedStatement ps = con.prepareStatement(
        "DELETE FROM student WHERE studentID=?"
    );

    ps.setInt(1, studentID);

    int rows = ps.executeUpdate();

    if (rows > 0) {
        System.out.println("Student Deleted Successfully");
    } else {
        System.out.println("Student Not Found");
    }

    ps.close();
    con.close();
}
}
