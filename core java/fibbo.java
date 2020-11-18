import java.util.*;
class fibbo
{
        public static void main(String args[])
        {
                int f,s,n,i=0;
                f=0;
                s=1;
                //Scanner k= new Scanner(System.in);
                System.out.print(f+" "+s);
                while(i<10)
                {
                        n=f+s;
                        System.out.print(" "+n);
                        f=s;
                        s=n;
                        i++;
                }
        }
}