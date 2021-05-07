import java.util.*;

class Array{

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int a1[]=new int[5];
	int sum=0;
	for(int i=0;i<a1.length;i++)
	{
		System.out.println("Enter Element["+i+"]:");
		a1[i]=sc.nextInt();
	}
	
	/*for(int i=0;i<5;i++)
	{
		System.out.println(a1[i]);
		
	}*/
	
	System.out.println("--------------------------");
	for(int x:a1)
	{
		System.out.print(x+" ");
	}
	
	//------------------------------------------
	for(int i=0;i<a1.length;i++)
	{
		sum+=a1[i];
	}
	System.out.println("Sum= "+sum);
	
//------------------------------------------
	int max=a1[0];
	for(int i=1;i<a1.length;i++)
	{
		if(a1[i]>max)
			max=a1[i];
		System.out.println("Max= "+max);
	}
	System.out.println("Max1= "+max);
}
}