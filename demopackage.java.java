


	import java.util.*;
	
	import marvellous.arthematic;

	class demopackage
	{
		public static void main(String arr[])
		{
		 Scanner sobj=new Scanner(System.in);	
			System.out.println("enter first number");
			int ino1=sobj.nextInt();
			
			System.out.println("enter second number");
			int ino2=sobj.nextInt();
			
			arthematic aobj=new arthematic(ino1.ino2);
			
			int iresult=aobj.addition();
			System.out.println("addition is :"+iresult);
			
			iresult=aobj.substraction();
			System.out.println("substraction is :"+iresult);
			
		}
	}
