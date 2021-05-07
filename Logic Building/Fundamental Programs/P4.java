import java.util.Scanner;
 
public class P4
{            
    public static void main(String[] args) 
    {
		int n=3;//input
		int flag=0;
		
		if(n==0||n==1)
			System.out.println(n+"is not prime no");
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not prime no");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(n+"is prime no");
		}
		
			
	
    }
}

//Logic flow:
0
1
2
3: 1,3
4: 1,2,4
7: 1,7