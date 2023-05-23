// Write Java Program to find the number of the words in the given text file.

import java.io.BufferedReader;
import java.io.FileReader;

public class CountFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("hello.txt"));
            String a;
            int len = 0;
            while ((a = bf.readLine()) != null) {
                len += a.split("\\s+").length;
            }
            System.out.println("Length : " + len);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
