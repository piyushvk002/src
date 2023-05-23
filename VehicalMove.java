import java.util.*;

interface Vehical{
    abstract void move();
}

class Helicopter implements Vehical
{
    public void move()
    {
        System.out.println("Helicopter flies in Air");
    }
}

class Car implements Vehical
{
    public void move()
    {
        System.out.println("Car drives on Road");
    }
}

class Train implements Vehical
{
    public void move()
    {
        System.out.println("Train runs on Track");
    }
}

class VehicalMove
{   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        
        int i;
        do{

            System.out.println("\n----------VEHICALS-----------");
            System.out.println("\n1)Helicopter\n2)Car\n3)Train\n4)Exit");
            System.out.println("\nEnter your choice : ");
             i = in.nextInt();

            switch(i)
            {
                case 1 : Helicopter obj1 = new Helicopter();
                        obj1.move();
                        break;
                case 2 : Car obj2 = new Car();
                        obj2.move();
                        break;
                case 3 : Train obj3 = new Train();
                        obj3.move();
                        break;
                case 4 : System.out.println("Thank you");
                default : System.out.println("Invalid Input");
            }

        }while(i != 4);
    }

}