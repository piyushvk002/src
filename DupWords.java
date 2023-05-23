public class DupWords {

    static int duplicateWords(String words[], int size)
    {
        int c=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(words[i].equals(words[j]))
                {
                    c++;
                }
            }
        }
        return c;
    }
    
    public static void main(String [] args)
    {
         String s = "HEy there i m hEy i";

        s = s.toLowerCase();
        String words[] = s.split(" ");

        int c = duplicateWords(words, words.length);
        
        // for(int i =0 ;i<words.length; i++)
        // {
        //     System.out.print("\t"+words[i]);
        // }

        System.out.println("Common words = "+c);
    }
}
