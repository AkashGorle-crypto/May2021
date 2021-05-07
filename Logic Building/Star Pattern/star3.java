class star3
{
public static void main(String args[])
{
	
	for(int i=1;i<=5;i++)//Row
	{
			for(int j=4;j>=i;j--)//Column : Spaces
			{
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)//Column : Star
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
	}
	
}
}


//3X3
//Row: i : 3
//Column: j : 3