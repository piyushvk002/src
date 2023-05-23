
import java.util.HashMap;
import java.util.Scanner;

public class HashMapBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<>();

        System.out.println("Enter no. of records u wanna insert : ");
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name for " + (i + 1) + " Record : ");
            String name = in.next();
            System.out.println("Enter phone number for " + (i + 1) + " Record : ");
            int phone = in.nextInt();

            hash.put(name, phone);
        }

        System.out.println("Enter name : ");
        in.nextLine();
        while (in.hasNext()) {
            try {
                String s = in.nextLine();

                int out = hash.get(s);
                System.out.println("Phone number = " + out);

            } catch (Exception e) {
                System.out.println("Not Found");
            }
        }
    }
}
