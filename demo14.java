import java.util.*;
class demo14
{
	public static void main(String a[])
	{
		Scanner sobj=new Scanner(System.in);
		int ino1=0,ino2=0,ians=0;
		
		System.out.println("enter first number");
		ino1=sobj.nextInt();
		
		System.out.println("enter secound number");
		ino2=sobj.nextInt();
		
		
		try
		{
			System.out.println("inside a try block");
		ians=ino1/ino2;
		System.out.println("Division of:"+ians);
	}
	catch(ArithmeticException obj)
	{
		System.out.println("inside catch1");
		System.out.println(obj);
	}
	catch(NullPointerException obj)
	{
		System.out.println("inside catch2");
		System.out.println(obj);
	}
	catch(ArrayIndexOutOfBoundsException obj)
	{
		System.out.println("inside catch3");
		System.out.println(obj);
	}
		
		finally
		{
			System.out.println("inside a finally");
			sobj.close();
		}
	}


}

		
		