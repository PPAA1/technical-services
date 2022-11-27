
class Finalizedemo
{
	public static void main(String s[])
	{
		
	 demo obj=new demo(4);
	 obj=null;
	 System.gc();
	 
	 
	 
	}
}

class demo
{
	int size;
	int arr[];
	public demo(int no)
	{
		System.out.println("inside constructor");
		
		size=no;
		arr=new int [size];
	}
	protected void finalize()
	{
		System.out.println("inside finlize method");
		arr=null;
	}
}
	
