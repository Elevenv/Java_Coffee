import java.util.*;
class floop
{
        public static void main(String[] args)
        {
                int i;
                Scanner k=new Scanner (System.in);
                System.out.print("Enter number");
                int j=k.nextInt();
                if(j<10)
                {
                        for(i=0;i<j;i++)
                        {
                                System.out.println(" "+i);

                        }
                }
        }
}