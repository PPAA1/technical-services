import java.util.*;


class Collection3
{
	
	public static void main(String arr[])
	{
		LinkedList<Book>lobj=new LinkedList<Book>();
		
		lobj.add(new Book("let us C",400));
	   lobj.add(new Book("data strctures",500));
	   lobj.add(new Book("c++ programming",480));
	   lobj.add(new Book("Angular web devlopment",100));
	   
	   Iterator iobj=iobj.iterator();
	   Book bref=NULL;
	   
	   System.out.println("elements linked are:");
	   while(iobj.hasNext());
	   {
		   bref=(Book)iobj.next();
		   bref.Display();
	   }
	}
	   
}

	
class Book
{
    public String Name;
	public int prize;
	
	public Book (String s, int i)
	{
		this.Name=s;
		this.prize=i;
	}
	
	public void Display()
	{
		
		System.out.println("Book name:"+this.Name+"prize :"+this.prize);
	}
}

    