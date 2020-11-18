import java.util.*;
class asd1 extends Exception
{
    public asd1()
    {
        System.out.println("Exception Occurs");
    }
        public static void main(String args[]) throws Exception
        {
            String pass="qwe",pass1;
            Scanner k=new Scanner(System.in);
            System.out.println("Enter Password:");
            pass1=k.next();
          
            try
            {
                if(pass.equals(pass1))
                {
                    System.out.println("Welcome");
                }
                else
                throw new asd1();
            }
            catch(asd1 e)
            {
                System.out.println("Invalid ");
            }/*
            finally
            {
                c=a+b;
                System.out.println(c);
            }*/
        }
}