import java.util.*;
class IteratorFor
{
    public static void main(String [] args)
    {
        ArrayList <Integer> arr = new ArrayList<Integer>();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("For : ");

        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        System.out.println("Foreach : ");

        for(Integer i : arr)
        {
            System.out.println(i);
        }

        System.out.println("Iterator : ");
        Iterator it = arr.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}