import java.util.Scanner;
 
public class P8
{            
    public static void main(String[] args) 
    {
		int n=525;
		int temp=n;
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		
		
		
		
		
		
	
    }
}

//Logic flow:
/*Palindrome Number:
n=5225 -------> 5 2 2 5 -----> same number
temp =n;
*/