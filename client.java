import java.net.*;
import java.io.*;
public class client
{
	public static void main(String A[])throws Exception
	{
		System.out.println("client appilcation is running...");
	    
		
		ServerSocket ss=new ServerSocket(2100);
		
	
	Socket s= new Socket("localhost",2100);
	System.out.println("client is waiting for the server to accept the request");
	
	printStream ps=new printStream(s.getOutputStream());
	BufferedReader br1 =new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in()));
	
	}
}

   