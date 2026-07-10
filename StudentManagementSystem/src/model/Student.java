package model;
public class Student {
    private int studentID;
    private String studentName;
    private int age;
    private char gender;
    private String department;
    private String email;
    private long phoneNumber;
    private int marks;
 
   public Student(int studentID,String studentName,int age,char gender,String department,String email,long phoneNumber,int marks){
      this.studentID = studentID;
      this.studentName = studentName;
      this.age = age;
      this.gender = gender;

       this.department =department;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.marks = marks;
   } 
   public void setStudentID(int studentID){
    this.studentID = studentID;
   }
   public int getStudentID(){
    return studentID;
   }
   public void setStudentName(String studentName){
    this.studentName = studentName;
   }
   public String getStudentName(){
    return studentName;
   }
   public void setAge(int age){
    this.age = age;
   }
   public int getAge(){
    return age;
   }
   public void setGender(char gender){
    this.gender = gender;
   }
   public char getGender(){
    return gender;
   }
   public void setDepartment(String department){
    this.department = department;
   }
   public String getDepartment(){
    return department;
   }
   public void setEmail(String email){
    this.email = email;
   }
   public String getEmail(){
    return email;
   }
   public void setPhoneNumber(long phoneNumber){
    this.phoneNumber = phoneNumber;
   }
   public long getPhoneNumber(){
    return phoneNumber;
   }
   public void setMarks(int marks){
    this.marks = marks;
   }
   public int getMarks(){
    return marks;
   }
   @Override
public String toString() {
    return "Student [StudentID=" + studentID +
           ", StudentName=" + studentName +
           ", Age=" + age +
           ", Gender=" + gender +
           ", Department=" + department +
           ", Email=" + email +
           ", PhoneNumber=" + phoneNumber +
           ", Marks=" + marks + "]";
}
}