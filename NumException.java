class NegativeException extends Exception
{
    NegativeException(String msg)
    {
        super(msg);
    }
}

class ZeroException extends Exception
{
    ZeroException(String msg)
    {
        super(msg);
    }
}

class NumException
{
    static long power(int n, int p)
    {
        long r=1;

        try
        {            
           
            if(n<0 || p<0)
            {
                throw new NegativeException("n or p should not be negative");
            }
            else if(n==0 || p==0)
            {
                throw new ZeroException("n or p should not be Zero");
            }
            else
            {

                for(int i = 1;i<=p;i++)
                {
                    r*=n;
                }

            }
            
            
        }
        catch(NegativeException e)
        {
            System.out.println(e);
        }
        catch(ZeroException e)
        {
            System.out.println(e);
        }
        return r;
    }

    public static void main(String [] args)
    {
        long r = power(0,-2);

        if(r!=1)
        System.out.println("Power = "+r);
    }
}