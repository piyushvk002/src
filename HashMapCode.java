/*
 
Write a Java Program to count the number of words in a string using HashMap.Output:
Input :Enter String: "This this is is done by Saket Saket";
{Saket=2, by=1, this=1, This=1, is=2, done=1}


 */

import java.util.HashMap;
import java.util.Scanner;

public class HashMapCode {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String myLine = sc.nextLine();
        String[] words = myLine.split(" ");
        int[] visited = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            visited[i] = 0;

        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (words[i] == words[j]) {
                    if (hm.containsKey(words[i])) {
                        hm.replace(words[i], hm.get(words[i]), hm.get(words[i]) + 1);
                    } else {
                        hm.put(words[i], 1);
                    }
                }
            }
        }
        System.out.println(hm);
    }
}
