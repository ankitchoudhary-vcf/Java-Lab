  

public class APattern  
{  
    public static void main(String[] args)  
    {
        System.out.println("Pattern is :- \n");
        int i, j, n=8;  
        for (i = 0; i<=n; i++)   
        {  

        
            // for (j = 0; j<= n / 2; j++)   
            // {  
            //     if ((j == 0 || j == n / 2) && i != 0 ||  i == 0  && j != n / 2 || i == n / 2)   
            //         System.out.print("*");  
            //     else  
            //         System.out.print(" ");  
            // }  
            // System.out.println();  

            for(j=0; j<=n/2; j++){
                if((j==0 || j==n/2 || i==0 || i==n/2))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }  
    }  
}  