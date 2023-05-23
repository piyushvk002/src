import java.util.*;

public class StrReverse {
    static void reverse(String ss, int size)
    {
        String [] s = ss.split("");
        String reverse  = "";

        for(int i=s.length-1;i>=0;i--)
        {
            reverse = reverse + s[i];
        }

        System.out.println("Reverse string = "+reverse);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the string : ");
        String str = in.nextLine();

        reverse(str,str.length());
    }
}
