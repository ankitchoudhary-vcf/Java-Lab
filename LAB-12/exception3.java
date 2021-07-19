public class exception3 {
    public static void main(String args[])
    {
        int i = 50;
        int j = 0;
        int data;
        try
        {
            data = i/j;
        }
        // arithmetic exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(i/(j+2));

    }
}