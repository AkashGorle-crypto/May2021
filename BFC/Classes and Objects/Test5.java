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
class Test5
{
	public static void main(String args[])
	{
		T t = new T();
		t.getdata(1,"Kunal");
		t.display();
		T t1 = new T();
		t1.getdata(2,"Komal");
		t1.display();
		t1.getdata(3,"Indrajit");
		t1.display();
		t1.getdata(2,"Komal");
		t1.display();
		
	}
	
}