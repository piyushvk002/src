/*
 
Write Java Program to find the transpose of a given matrix . 


 */

public class TransposeCode {
    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 1, 5, 6 } };
        int[][] trans_a = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                trans_a[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("]");
        }

        for (int i = 0; i < trans_a.length; i++) {
            System.out.print("[\t");
            for (int j = 0; j < trans_a[0].length; j++) {
                System.out.print(trans_a[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
}
