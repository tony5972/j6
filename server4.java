import java.net.*;
import java.io.*;

class server4
  {
    public static void main(String[] args) throws IOException 
     {
       Socket s = null;
       ServerSocket ss = null;
       String name[]=new String[20];
       int i=0;
       try 
        {
          ss = new ServerSocket(1234);
          System.out.println("Server Started.......");
          s= ss.accept();
          System.out.println("Server Connected.......");
          BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
          System.out.println("The messages are:");
          name[0]=in.readLine();
          while(!name[i].equalsIgnoreCase("end"))
             {
               System.out.println(name[i]);
               i++;
               name[i]=in.readLine();
             }   
          s.close();
        } 
      catch (Exception e) 
        {
          System.out.println("Error: "+e);
        }
    } 
 }