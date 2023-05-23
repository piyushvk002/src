/*
 *  Implementing “Multiple Inheritance”. Create a two interfaces Account containing methods set() and display() And interface Person containing methods store() and disp(). Derive a class Customer from Person and Account. Accept the name, account number, balance and display all the information related to account along with the interest. 

 * 
 */

interface Account {
    abstract void set(int accno, int bal);

    abstract void display();
}

interface Person {
    abstract void store(String name);

    abstract void disp();
}

class Customer implements Account, Person {
    String name;
    int accno;
    int bal;

    @Override
    public void set(int accno, int bal) {
        this.accno = accno;
        this.bal = bal;
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Name : " + name);
    }

    @Override
    public void display() {
        System.out.println("Account Number : " + accno);
        System.out.println("Balance : " + bal);
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {
        Customer swarup = new Customer();
        swarup.set(121, 100000);
        swarup.store("Swarup");
        swarup.disp();
        swarup.display();
    }
}
