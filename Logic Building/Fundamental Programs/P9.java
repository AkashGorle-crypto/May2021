import java.util.Scanner;
 
public class P9
{            
    public static void main(String[] args) 
    {
		int binary[]=new int[20];
		int index=0;
		int n=10;
		while(n>0)
		{
			binary[index++]=n%2;
			n=n/2;
		}
		
		for(int i=index-1;i>=0;i--)
		{
			System.out.print(binary[i]);
		}
		
		
			

		
		
		
		
		
		
	
    }
}

//Logic flow:
/*Number Sytem:
1.Decimal 0-9=10
2.Binary 0/1
3.Octal 0-7=8
000 - 0
001 - 1
010 - 2
011 - 3
100 - 4
101 - 5
110 - 6
111 - 7
4.Hexadecimal
0000 - 0
0001 - 1
0010 - 2
0011 - 3
0100 - 4
0101 - 5
0110 - 6
0111 - 7
1000 - 8
1001 - 9
1010 - A
1011 - B
1100 - C
1101 - D
1110 - E
1111 - F

Decimal to Binary
*/
2^0=1
2^1=(2^0)*1=1
2^2=(2)*2=4
2^3=(2*2)*2=8
2^4=(2*2*2)*2=16
base= base*2