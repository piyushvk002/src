/*
 
 Write a program to read 10 string from console and then print the sorted strings on console (Use String Class).2) combine two string   3)reverse first string nd dispaly it

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>();
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }

        Collections.sort(strings);
        System.out.println("Sorted strings:");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("Enter two strings to combine:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String combinedString = str1 + str2;
        System.out.println("Combined string: " + combinedString);

        StringBuilder reversedString = new StringBuilder(str1);
        reversedString.reverse();
        System.out.println("Reversed first string: " + reversedString.toString());

        scanner.close();
    }
}