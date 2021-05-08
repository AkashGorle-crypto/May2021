class Test
{
	public void display()
	{
		System.out.println("Hello CDAC !!!!");
	}
	public void show()
	{
		System.out.println("Hello CDAC Mumbai!!!!");
	}
	
	
	public static void main(String args[])
	{
			Test t1 = new Test();
			t1.display();
			t1.show();
			Test t2 = new Test();
			t2.display();
			t1.display();
			
	}
}