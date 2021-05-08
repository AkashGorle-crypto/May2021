class T
{
	private int id;
	private String name;
	
	void getdata(int id1, String name1)
	{
		id=id1;
		name=name1;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	
	
}
class Test4
{
	public static void main(String args[])
	{
		T t = new T();
		t.getdata(1,"Kunal");
		t.display();
		t.getdata(2,"Komal");
		t.display();
		
	}
	
}