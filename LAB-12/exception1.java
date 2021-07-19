
public class exception1 {
    public static void main(String args[])
    {
        try
        {
            int data = 100/0;
        }
        // arithmetic exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest code");

    }
}
