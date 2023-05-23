/*
Write a program to implement following inheritance. Accept data for 5 persons and display the name of employee having salary greater than 5000.

Class Name: Person
Member variables:
Name, age

Class Name: Employee
Member variables:
Designation, salary
 */

import java.util.Scanner;

class Person {
    String name;
    int age;

    void getData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Employee extends Person {
    String des;
    float salary;

    void getData(String name, int age, String des, float salary) {
        super.getData(name, age);
        this.des = des;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Designation : " + des);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        Scanner sc = new Scanner(System.in);
        String name, des;
        float sal;
        int age;
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();

            System.out.print("Enter Name : ");
            name = sc.nextLine();
            System.out.print("Enter Age : ");
            age = sc.nextInt();
            System.out.print("Enter Designation : ");
            sc.nextLine();
            des = sc.nextLine();
            System.out.print("Enter Salary : ");
            sal = sc.nextInt();
            sc.nextLine();
            emp[i].getData(name, age, des, sal);
        }

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].salary > 5000) {
                emp[i].display();
            }
        }

    }
}
