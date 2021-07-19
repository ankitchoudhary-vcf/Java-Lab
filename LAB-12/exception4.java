public class exception4 {
    public static void main(String args[])
    {
        try
        {
            int data = 50/0;
        }
        // arrary index number exception 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest code");

    }
}