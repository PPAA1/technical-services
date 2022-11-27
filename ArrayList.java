import java.util.*;
class ArrayList
{
    public static void main(String arg[])
    {
		Vector <float>aobj= new Vector<float>(); 
		                      
		 aobj.add(10.6f);
		 aobj.add(20.6f);
		 aobj.add(30.6f);
		 aobj.add(40.6f);
		 aobj.add(60.6f);
		 
		 
		 
		 Iterator iobj=aobj.iterator();
		 while(iobj.hasNext())
		 {
			 System.out.println(iobj.next());
		 }
		 
		 
		 aobj.clear();
		
		
	}
}