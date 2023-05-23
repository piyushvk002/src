import java.util.*;

public class HaskMapCountWords {
    public static void main(String [] args)
    {
        HashMap <String, Integer> hash = new HashMap<>();

        String str = "hii there its mee hii me me";

        String [] words = str.split(" ");

        for(String s : words)
        {
            Integer i = hash.get(s);

            if(i==null)
            {
                hash.put(s,1);
            }
            else
            {
                hash.put(s,i+1);
            }
        }
        System.out.println(hash);
    }
}
