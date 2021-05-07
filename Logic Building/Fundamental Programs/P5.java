import java.util.Scanner;
 
public class P5
{            
    public static void main(String[] args) 
    {
		int n1=0,n2=1;
		int n3;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=1;i++)
		{
		n3=n1+n2;
		System.out.print(" "+n3);	
		n1=n2;
		n2=n3;
		}
	
    }
}

//Logic flow:
/*
Fibonacci Series.
n1=0;
n2=1;
n3=n1+n2;
-------------
n1=n2
n2=n3
0 1 1 2 3 5 8 13
*/