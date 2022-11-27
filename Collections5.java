import java.util.*;
class Collections3
{
    public static void main(String arg[])
    {
		Hashtable <String,Integer>hobj=new HashTable<String,Integer>();
		
		Hobj.put("ppa",1800);
		hobj.put("lb",1400);
		hobj.put("python",1500);
		hobj.put("lsp",2100);
		System.out.println(hobj.get("python"));
		hobj.remove("lb");
		Enumeration eobj=hobj.keys();
		
		while(eobj.hasMoreElements())
		{
			
			System.out.println("value is"+eobj.nextElement());
		}
	}
		
	}
	
