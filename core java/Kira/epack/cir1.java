
package epack;
import java.util.*;
public class cir1
{
    String name;
    int id;
    Scanner k=new Scanner (System.in); 
    public void get()
    {
        
        System.out.println("Enter name and id:");
        name=k.next();
        id=k.nextInt();
    }
    public void dis()
    {
            System.out.println("Name:"+name+"\tID:"+id);
    }
}