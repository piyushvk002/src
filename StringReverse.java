// Java Program to Reverse a String. 

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        System.out.println(str);
        sc.close();
    }
}
