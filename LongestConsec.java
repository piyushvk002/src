/*
Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
    Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
    The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.

 */

import java.util.Arrays;

public class LongestConsec {
    public static void main(String[] args) {
        int[] a = { 49, 1, 3, 200, 2, 4, 70, 5 };
        int maxCount = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            int j = 1;
            while (Arrays.binarySearch(a, a[i] + j) >= 0) {
                count++;
                System.out.println(a[i] + j);
                j++;
            }
            System.out.println("==========");
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
