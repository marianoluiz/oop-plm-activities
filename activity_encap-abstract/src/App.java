import class_functions.StudentGrade;
import class_functions.Area;

public class App {
    public static void main(String[] args) throws Exception {
        
        StudentGrade student = new StudentGrade();
        System.out.println("----------Number 1----------");
        student.setstrlastname("Doe");
        student.setstrfirstname("John");
        student.setstrstudentno("202334015");
        student.setemailaddress("jdoe2023@plm.edu.ph");
        student.setstrcellphoneno("+63 123 456 7890");
        student.setintcoursegrade(97);
        student.setstrsubjectcode("CSC 0101-2");

        System.out.println("Last Name: " + student.getstrlastname());
        System.out.println("First Name: " + student.getstrfirstname());
        System.out.println("Student No: " + student.getstrstudentno());
        System.out.println("Email Address: " + student.getemailaddress());
        System.out.println("Cellphone No: " + student.getstrcellphoneno());
        System.out.println("Course Grade: " + student.getintcoursegrade());
        System.out.println("Subject Code: " + student.getstrsubjectcode());
        System.out.println("----------Number 1----------");

        System.out.println("----------Number 2----------");
        Area area = new Area();
        
    }
}
