import java.util.Scanner;

public class ComEle2Arr {
    
    static void commonElements(int arr1[], int arr2[], int size1, int size2)
    {
        int c;
        System.out.println("common elements : ");
        for(int i=0;i<size1;i++)
        {
            c=0;
            for(int j=0;j<size2;j++)
            {
                if(c==0)
                {
                    if(arr1[i] == arr2[j])
                    {
                        System.out.print("\t"+arr1[i]);
                        c++;
                    }
                }
            }
        }
    }

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        int size1;
        System.out.println("Enter size for 1st array : ");
        size1 = in.nextInt() ;

        int []arr1 = new int[size1];

        System.out.println("Enter "+size1+" elements for array : ");
        for(int i=0; i<size1; i++)
        {
            arr1[i] = in.nextInt();
        }

        int size2;
        System.out.println("Enter size for 2nd array : ");
        size2 = in.nextInt() ;

        int []arr2 = new int[size2];

        System.out.println("Enter "+size2+" elements for array : ");
        for(int i=0; i<size2; i++)
        {
            arr2[i] = in.nextInt();
        }

        commonElements(arr1, arr2, size1, size2);
    }
}
