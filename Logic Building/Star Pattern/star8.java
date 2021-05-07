class star8

{
public static void main(String args[])
{
	for(int i=1;i<=4;i++)//Row
	{
		for(int j=4;j>=i;j--)//Space
		{
				System.out.print(" ");
		}
		
		for(int k=1;k<=i;k++)//Yellow triangle
		{
				System.out.print("*");
		}
		
		for(int l=1;l<=i;l++ )//Red triangle
		{
				System.out.print("*");
		}
		
		System.out.println();
	}
	
}
}


     