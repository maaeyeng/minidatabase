
import java.io.*;  
import java.net.*;  
public class MyClient {  
public static void main(String[] args) {  

try{      
Socket s=new Socket("localhost",6666);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
System.out.println();
System.out.println();
System.out.println();
dout.writeUTF("\n\nHello Server\n\n");  
System.out.println("Sern Ok");
System.out.println();
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){
    System.out.println();
    System.out.println(e);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Setting Server");
    System.out.println();
    System.out.println();
    System.out.println();
}  

}
}  