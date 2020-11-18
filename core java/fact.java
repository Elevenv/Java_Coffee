import java.util.*;
class fact
{
   /* int f(int n)
    {
        if()

    }*/
        public static void main(String arg[])
        {
                int num,fa=1;
                System.out.print("Enter no");
                Scanner k=new Scanner(System.in);
                num=k.nextInt();
                while(num>1)
                {
                        fa=fa*num;
                        num--;

                }
                System.out.print(fa);
        }
}