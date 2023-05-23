import java.util.*;

public class Transpose {
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int [][] arr = new int [3][3];

        System.out.println("Enter 9 digits : \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix : \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix : \n");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\t"+arr[j][i]);
            }
            System.out.println();
        }

    }
}

