class star5
{
public static void main(String args[])
{
	for(int i=1;i<=3;i++)//Row
	{
			for(int j=2;j>=i;j--)//Column : Spaces
			{
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)//Column : Star
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
	}
	for(int i=1;i<=3;i++)//Row
	{
			for(int j=0;j<i-1;j++)//Column : Spaces
			{
				
				System.out.print(" ");
				
			}
			
			for(int k=3;k>=i;k--)//Column : Star
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
	}
	
}
}
