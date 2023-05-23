// Write a Java program to check that String is palindrome or not.

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int l = 0;
        int r = text.length() - 1;
        boolean label = true;
        while (l < r) {
            if (text.charAt(r) != text.charAt(l)) {
                label = false;
            }
            l++;
            r--;
        }
        System.out.println("Is " + text + " Palindrome : " + label);
    }
}
