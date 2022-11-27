

class ExceptionDemo11
{
	public static void main(String a[])
	{
		Scanner sobj=new Scanner(System.in);
		int ino1=0,ino2=0,ians=0;
		System.out.println("enter the first number");
		ino1=sobj.nextInt();
		
		System.out.println("enter the secound number");
		ino2=sobj.nextInt();
		
		ians=ino1/ino2;
		System.out.println("Division is:"+ians);
	}
}