import java.util.Scanner;
 
public class P7
{            
    public static void main(String[] args) 
    {
		int n=1531;
		int x=n;
		int a,c=0;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		
		if(x==c)
			System.out.println(x+" Armstrong Number");
		else
			System.out.println(x+" Not a Armstrong Number");
		
	
    }
}

//Logic flow:
/*
armstrong number:
n=153
153=(1*1*1)+(5*5*5)+(3*3*3)
   =1^3+5^3+3^3
   =1+125+27
   =153
   
371
257
*/