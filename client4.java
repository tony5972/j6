import java.io.*;
import java.net.*;

class client4
  {
    public static void main(String[] args) throws IOException 
      {
    	Socket s = null;
    	PrintWriter out = null;
    	int i=0;
    	String name[]=new String[20];
        try 
         {
           s = new Socket("127.0.0.1", 1234);
           out = new PrintWriter(s.getOutputStream(), true);
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the message and echoes 'end' to stop: ");
           name[0]=br.readLine();
           while(!name[i].equalsIgnoreCase("end"))
             {
               out.println(name[i]);
               i++;
               name[i]=br.readLine();
             }
           out.println(name[i]);  
           s.close();
         } 
        catch (UnknownHostException e) 
         {
            System.out.println("Error :"+e);
         } 
     }
  }
