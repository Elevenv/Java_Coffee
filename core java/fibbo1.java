import java.util.*;
class fibbo1
{
        public static void main(String args[])
        {
                int f=0,s=1,n,i=0;
                //Scanner k=new Scanner(System.in);
                //i=k.nextInt();
                System.out.println("0"+"\n"+"1");
                while(i<10)
                {
                        n=f+s;
                        System.out.println(n);
                        f=s;
                        s=n;
                        i++;


                }
        }
}