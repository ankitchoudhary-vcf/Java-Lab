import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exception6 {
    public static void main(String args[])
    {
        PrintWriter pw;
        try
        {
            // create a new text file of name exception6.txt
            pw = new PrintWriter("exception6.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        System.out.println("File saved successfully");

    }
}
