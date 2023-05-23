// prime or not.

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean label = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                label = false;
                break;
            }
        }
        System.out.println("Is Prime : " + label);
    }
}
