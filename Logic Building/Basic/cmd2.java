public class cmd2
{
public static void main(String args[])
{
	String s1 = args[0];
	String s2 = args[1];
	
	String s3 = s1+s2;
	
	System.out.println("First argument :"+s1);
	System.out.println("Second argument :"+s2);
	System.out.println("Third argument :"+s3);
	
	//Wrapper class
	int i = Integer.parseInt(s1);
	int j = Integer.parseInt(s2);
	int k = i+j;
	
	
	System.out.println("First argument :"+i);
	System.out.println("Second argument :"+j);
	System.out.println("Third argument :"+k);
}
}