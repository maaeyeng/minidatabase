import java.io.*;  
import java.net.*;  
import java.lang.Error;
public class testServer {  
public static void main(String[] args){  

    try{  
        ServerSocket ss=new ServerSocket(6666);  
        Socket s=ss.accept();//establishes connection   
        DataInputStream dis=new DataInputStream(s.getInputStream());  
        String  str=(String)dis.readUTF();  
        System.out.println("Server = "+str);  
        System.out.println();
        System.out.println();
        ss.close();  
    }
    catch(Exception e)
    {
        System.out.println(e);
    }  
}  
}  