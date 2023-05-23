/*
Write a Java Program to iterate ArrayList using for-loop,
iterator, and advance for-loop. Insert 3 Array List.
Input 20 30 40
 
Output:


iterator Loop:
20
30
40
Advanced For Loop:
20
30
40
For Loop:
20
30
40
 */

import java.util.*;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(12);
        ar.add(13);
        ar.add(14);

        for (Integer integer : ar) {
            System.out.println(integer);
        }

        Iterator<Integer> it = ar.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

    }
}
