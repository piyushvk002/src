/*
  
 Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

 */

class Person {
    String fname, lname;

    public void setNames(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFirstName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }
}

class Employee extends Person {
    String jobTitle, jobId;

    public void setData(String jobTitle, String jobId) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return this.jobId;
    }

    public String getLastName() {
        return lname + " " + this.jobTitle;
    }
}

public class EmpPer {
    public static void main(String[] args) {
        Employee onkar = new Employee();
        onkar.setNames("Onkar", "Wadtile");
        onkar.setData("Garage Owner", "12002");
        System.out.println(onkar.getFirstName() + " " + onkar.getLastName() + "\n" + onkar.getEmployeeId());
    }
}
