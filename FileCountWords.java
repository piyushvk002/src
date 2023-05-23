import java.io.*;

public class FileCountWords {
    public static void main(String [] args)
    {
        try{
            FileReader fin = new FileReader("rakzz.txt");
        BufferedReader br = new BufferedReader(fin);

        String line;
        int c=0;

        while((line = br.readLine()) != null)
        {
            String [] words = line.split(" ");

            c += words.length;
        }

        System.out.println("Words = "+c);

        fin.close();
        br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
