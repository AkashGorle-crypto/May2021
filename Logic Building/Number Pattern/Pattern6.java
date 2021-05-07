class Pattern6
{
public static void main(String args[])
{
	int c=0;
	for(int i=1;i<=5;i++)//Row
	{
			for(int j=1;j<=i;j++)//Column
			{
				c=c+1;
				System.out.print(c+" ");
				
			}
			
			System.out.println();
	}
	
}
}


//5X5
//Row: i : 5
//Column: j : 5