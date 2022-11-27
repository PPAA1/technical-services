import java.util.*;

class collection
{
	
	public static void main(String arg[])
	{
	  LinkedList<Integer> lobj=new LinkedList<Integer>();
	  
	  lobj.add(11);
	  lobj.add(21);
	  lobj.add(51);
	  lobj.add(101);
	  lobj.add(111);
	  
	  System.out.println("elements of linked list:"+lobj);
	  
	  Iterator iobj=lobj.iterator();
	  
	  System.out.println("data using of iterator:");
	  while(iobj.hasNext())
	  {
		  System.out.println(iobj.next());
	  }
	  if(lobj.Contains(121))
	  {
		  System.out.println("121 is presint in Ll");
	  }
	  else
	  {
		  System.out.println("121 in not prsint");
	  }
	}
}	