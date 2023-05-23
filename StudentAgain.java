/*
  
Write a Java program to create
 a class called "Student" with a name, grade, 
 and courses attributes, and methods to add and remove courses.

 */

import java.util.ArrayList;

public class StudentAgain {
    String name, grade;
    ArrayList<String> courses = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void addCourses(String course) {
        this.courses.add(course);
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }

    public void displayAll() {
        System.out.println("Name : " + this.name);
        System.out.println("Grade : " + this.grade);

        for (String couse : this.courses) {
            System.out.println(couse);
        }

    }

    public static void main(String[] args) {
        StudentAgain sa = new StudentAgain();
        sa.setName("Swarup");
        sa.setGrade("SY");
        sa.addCourses("Data Science");
        sa.addCourses("Web Dev");
        sa.addCourses("OOPS");
        sa.addCourses("Database Management");
        sa.removeCourse("Data Science");
        sa.displayAll();

    }
}
