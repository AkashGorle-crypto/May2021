import java.util.*;
import java.lang.*;

class Ternary
{
	public static void main(String args[])
	{
		
		int n1=10, n2=20;
		
		int max =(n1>n2)? n1 : n2;
		System.out.println("Max= "+max);
		
		int max =(n1>n2)? n1+n2 : n1-n2;
		System.out.println("Max= "+max);
	}
}