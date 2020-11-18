import java.net.*;
import java.io.*;
import java.util.*;
class client{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",100);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            Scanner scan = new Scanner(System.in);
            while(true){
                System.out.println("Enter your msg");
                String str = scan.next();
                dos.writeUTF(str);
                String out = (String) dis.readUTF();
                System.out.println("Server "+out);
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}