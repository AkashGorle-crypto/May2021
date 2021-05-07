class Pattern5
{
public static void main(String args[])
{
	int c=0;
	for(int i=1;i<=5;i++)//Row
	{
			for(int j=1;j<=i;j++)//Column
			{
				System.out.print(j);
				c=c+j;
			}
			System.out.print(" "+c);
			c=0;
			System.out.println();
	}
	
}
}


//3X3
//Row: i : 3
//Column: j : 3