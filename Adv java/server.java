import java.net.*;
import java.io.*;
import java.util.*;
class server{
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(100);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            Scanner scan = new Scanner(System.in);
            while(true){
                //System.out.println("Client"+str);
                String out = dis.readUTF();
                System.out.println("client "+out);
                System.out.println("Enter your msg");
                String str = scan.next();
                dos.writeUTF(str);
                ss.close();
                s.close();
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}