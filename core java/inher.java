import java.util.*;
class base
{
int rn;
Scanner k=new Scanner(System.in);
void get()
{
        System.out.println("enter rn:");
        rn=k.nextInt();

}
void dis()
{
    System.out.println("rn:"+rn);
        
}
}
class der extends base
{
    int m;
  //  Scanner q=new Scanner (System.in);
    void get1()
    {
        System.out.println("enter Marks:");
        m=k.nextInt();

    }
    void dis1()
    {
        System.out.println("Marks:"+m);
        
    }
}
class inher
{
        public static void main(String args[])
        {
                der d=new der();
                d.get();
                d.get1();
                d.dis();
                d.dis1();
        }
}

