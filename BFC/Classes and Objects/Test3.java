 class T
{
	private int data;
	
	public void msg()
	{ 
		System.out.println("CDAC....."+data);
	}
}
class Test3
{
	public static void main(String args[])
	{
		
		T t =new T();
		t.data =40;
		System.out.println(t.data);//CE
		t.msg();//CE
	}
	
}