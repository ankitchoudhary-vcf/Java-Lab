
import java.util.*;

class PermutationalCombination
{
	double fact(double n)
	{
	   int i=1;
             	    double fact=1;
	    while(i<=n)
	    {
	   	   fact=fact*i;
		   i++;
 	    }
  	      return fact;
	}

	double permutation(int n,int r )
	{
		double result=fact(n)/fact(n-r);	
		return result;
	}

	double combination(int n,int r)
	{
		double result=fact(n)/(fact(n-r)*fact(r));
		return result;
	}

	public static void main(String arg[])	
	{
		PermutationalCombination p = new PermutationalCombination();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n >> ");
        int n=sc.nextInt();

		System.out.print("Enter the value of r >> ");
        int r=sc.nextInt();
		
		if(n>=r)
		{
			System.out.println("The value of "+n+"P"+r+" is : "+p.permutation(n,r));	
			System.out.println("The value of  "+n+"C"+r+" is : "+p.combination(n,r));
		}
		else
			System.out.println("n value should be greater than or equals to r value");
		
	}	
}