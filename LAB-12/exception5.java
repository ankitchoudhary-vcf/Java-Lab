public class exception5 {
    public static void main(String args[])
    {
        try
        {
            int arr[] = {1,3,5,7};
        }
        // arrary index number exception 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest code");

    }
}