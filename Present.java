import java.util.Scanner;

public class Present {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        int c=0;

        System.out.println("Enter the word : ");
        String word = in.nextLine();

        System.out.println("Enter the letter : ");
        String letter = in.nextLine();

        // String [] l = word.split("");

        // for(int i =0;i<l.length;i++)
        // {
        //     if(l[i].equals(letter))
        //     {
        //         System.out.println(letter+" present in "+word);
        //         c++;
        //     }
        // }

        // if(c==0)
        // {
        //     System.out.println(letter+" is not present in "+word);
        // }

        if(word.contains(letter))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not Present");
        }

        
    }
}
