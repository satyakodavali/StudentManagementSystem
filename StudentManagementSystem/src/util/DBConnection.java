package util;
import java.util.*;
import java.sql.*;
import java.io.IOException;
public class DBConnection {
    public static Connection getConnection() throws Exception{ 
    // load the driver and registerit
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Establish connection
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1213");
    return con;
    }
 }    
// PreparedStatement ps = con.prepareStatement("insert into student value(?,?,?,?,?,?,?,?)");
//     Scanner sc = new Scanner(System.in);
//     while(true){
//      System.out.println("Enter studentID");
//      int a = sc.nextInt();
//      System.out.println("Enter StudentName");
//      String b = sc.nextLine();
//      System.out.println("Enter Age");
//      int c = sc.nextInt();
//      System.out.println("Enter Gender");
//      char d = sc.next().charAt(0);
//      System.out.println("Enter course");
//      String e = sc.nextLine();
//      System.out.println("Enter Email");
//      String f = sc.nextLine();
//      System.out.println("Enter phoneNumber");
//      long g = sc.nextLong();
//      System.out.println("Enter marks");
//      int h = sc.nextInt();
//      ps.setInt(1,a);
//      ps.setString(2, b);
//      ps.setInt(3,c);
//      ps.setCharacterStream(4,d);

//      int i = ps.executeUpdate();

//     }