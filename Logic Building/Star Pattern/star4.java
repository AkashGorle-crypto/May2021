class star4
{
public static void main(String args[])
{
	
	for(int i=1;i<=3;i++)//Row
	{
			for(int j=1;j<=i;j++)//Column : Spaces
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
