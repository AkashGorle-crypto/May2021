import java.util.Scanner;
 
public class P5
{            
    public static void main(String[] args) 
    {
		int n=0;
		int fact=1;
		if(n==0||n==1)
			System.out.println("1");
		else{
			
			for(int i=1;i<=n;i++)
			{
				fact =fact*i;
			}
		}
		
	
    }
}

//Logic flow:
Factorial:
n!=n*(n-1)*(n-2)*...*1

0!=1
1!=1
3!=3*2*1=6
5!=5*4*3*2*1=120
125!= 125*....*1