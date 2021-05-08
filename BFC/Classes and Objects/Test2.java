public class T
{
	private int data;
	private int sal=10000;
	private void msg()
	{ 
		System.out.println("CDAC.....");
	}
}
class Test2
{
	public static void main(String args[])
	{
		
		T t =new T();
		t.data =40;
		System.out.println(t.data);//CE
		t.msg();//CE
	}
	
}