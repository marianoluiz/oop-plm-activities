

import class_functions.Area;
import class_functions.StudentGrade;
import implement_shapes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Number 1 - Overloading
        StudentGrade student = new StudentGrade();
        System.out.println("--------------------Number 1--------------------");
        student.setstrlastname("Doe");
        student.setstrfirstname("John");
        student.setstrstudentno("202312345");
        student.setemailaddress("jdoe2023@plm.edu.ph");
        student.setstrcellphoneno("+63123 456 7890");
        student.setintcoursegrade(97);
        student.setstrsubjectcode("CSC 0101-2");

        System.out.println("Last Name: " + student.getstrlastname());
        System.out.println("First Name: " + student.getstrfirstname());
        System.out.println("Student No: " + student.getstrstudentno());
        System.out.println("Email Address: " + student.getemailaddress());
        System.out.println("Cellphone No: " + student.getstrcellphoneno());
        System.out.println("Course Grade: " + student.getintcoursegrade());
        System.out.println("Subject Code: " + student.getstrsubjectcode());
        System.out.println("--------------------Number 1--------------------\n");

        // Number 2 - Getter & Setter 
        System.out.println("--------------------Number 2--------------------");
        Area circleArea = new Area("Circle", 2);
        System.out.println("Shape: " + circleArea.strShape);
        System.out.println("Area: " + circleArea.dblArea);
        System.out.println("Radius: " + circleArea.dblRadius);
        System.out.println("Length: " + circleArea.dblLength);
        System.out.println("Width: " + circleArea.dblWidth + "\n");
        
        Area rectangleArea = new Area("Rectangle", 2.3, 2.5);
        System.out.println("Shape: " + rectangleArea.strShape);
        System.out.println("Area: " + rectangleArea.dblArea);
        System.out.println("Radius: " + rectangleArea.dblRadius);
        System.out.println("Length: " + rectangleArea.dblLength);
        System.out.println("Width: " + rectangleArea.dblWidth);
        System.out.println("--------------------Number 2--------------------\n");

        // Number 3 - Abstraction
        System.out.println("--------------------Number 3--------------------");

        // Abstraction using Abstract Class
        System.out.println("Using Abstraction:");

        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(circle.shapename());
        circle.description();
        System.out.println("Sides: " + circle.sides());
        
        System.out.println();

        System.out.println(triangle.shapename());
        circle.description();
        System.out.println("Sides: " + triangle.sides());

        System.out.println();

        // Abstraction using Interface Class
        Hexagon hexagon = new Hexagon();
        Pentagon pentagon = new Pentagon();

        System.out.println("Using Interface:");
        System.out.println(hexagon.shapename());
        hexagon.description();
        System.out.println("Sides: " + hexagon.sides());

        System.out.println();

        System.out.println(pentagon.shapename());
        hexagon.description();
        System.out.println("Sides: " + pentagon.sides());

        System.out.println("--------------------Number 3--------------------"); 
    }
}
