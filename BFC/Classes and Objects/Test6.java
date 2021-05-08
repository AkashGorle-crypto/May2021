class T
{
	private int id;
	private String name;
	static int total;
	
	void getdata(int id1, String name1,int t)
	{
		id=id1;
		name=name1;
		total=t;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+t);
	}
	
	
	
}
class Test6
{
	public static void main(String args[])
	{
		T t = new T();
		t.getdata(1,"Kunal",10);
		t.display();
		T t1 = new T();
		t1.getdata(2,"Komal",20);
		t1.display();
		t.display();
		
		
	}
	
}