/*
  
  Create a class Student with attributes roll no, name,
   age and course. Initialize values through parameterized 
   constructor. If age of student is not in between 15 and 
   21 then generate user-defined exception "AgeNotWithinRangeException". 
   If name contains numbers or special symbols raise exception 
   "NameNotValidException". Define the two exception classes.

 */

import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String txt) {
        super(txt);
    }
}

class NameNotValidException extends Exception {
    NameNotValidException(String txt) {
        super(txt);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the roll no : ");
        int roll = sc.nextInt();
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.print("Enter the course : ");
        String course = sc.nextLine();
        try {
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("You cannot be our Student.");
            }

            for (int i = 0; i < name.length(); i++) {
                if (!Character.isLetter(name.charAt(i))) {
                    throw new NameNotValidException("Your name is Not Valid");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Roll : " + roll);
            System.out.println("Course : " + course);

        }
        sc.close();
    }
}
