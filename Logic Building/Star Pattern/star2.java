class star2
{
public static void main(String args[])
{
	
	for(int i=1;i<7;i++)//Row
	{
			for(int j=1;j<=i;j++)//Column
			{
				
				System.out.print("*");
				
			}
			
			System.out.println();
	}
	for(int i=1;i<=7;i++)//Row
	{
			for(int j=7;j>=i;j--)//Column
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