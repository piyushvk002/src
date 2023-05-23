import java.util.*;

class DupEle{

    static void duplicateElements(int arr[], int size)
    {
        int i,j,k=0,l,c=0;
        int [] dup = new int[size];

        
        for( i =0 ; i<size ; i++)
        {
            for(j=0;j<size;j++)
            {
                if(i==j)
                {
                    continue;
                }    
                else
                {
                    if(arr[i] == arr[j])
                    {
                        for(l=0;l<size;l++)
                        {
                            if(dup[l]==arr[i])
                            {
                                break;
                            }
                        }
                        if(l==size)
                        {
                            dup[k++] = arr[i];
                            c++;
                        }                            
                    }
                }
            }
        }
        System.out.println("Duplicate elements : ");
        for(l=0;l<c;l++)
        {
            System.out.print("\t"+dup[l]);
        }
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int size = 7;
        int []arr = new int[size];

        System.out.println("Enter "+size+" elements for array : ");
        for(int i=0; i<size; i++)
        {
            arr[i] = in.nextInt();
        }

        duplicateElements(arr , size);
        // System.out.println("Array : ");
        // for(int i=0; i<size; i++)
        // {
        //     System.out.print("\t1"+arr[i]);
        // }
    }
}
