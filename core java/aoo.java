import java.util.*;

class qwe
{
    int rn,marks;
    Scanner k=new Scanner (System.in);

    void get()
    {
        System.out.println("enter rn");
        rn=k.nextInt();
        System.out.println("enter marks");
        marks=k.nextInt();
    }
    void dis()
    {
        System.out.println("rn:"+rn);
        System.out.println("marks:"+marks);

    }
}
class aoo
{


        public static void main(String args[])
        {
            aoo[] ab=new aoo[2];
            //ab=new aoo[2];
            int i;
            for(i=0;i<2;i++)
            {
                ab[i]=new aoo();
            }
            for(i=0;i<2;i++)
            {
                ab[i].get();
                ab[i].dis();
                
            }
            /*aoo a=new aoo();
            ab[i].get();
            ab[i].dis();
*/
        }
}