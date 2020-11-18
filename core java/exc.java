interface exc3
{
  void m4();
}
interface exc1 extends exc3
{
  void m1();
}
interface exc2 extends exc3
{
  void m2();
}
class exc implements exc1,exc2
{
public void m1()
  {
    
    System.out.println("m1");
  }
  public void m2()
    {
        
      System.out.println("m2");
    }
    void m3()
      {
        
      System.out.println("m3");
      }
      public void m4()
      {
        
      System.out.println("m1");
      }
    
    public static void main(String args[])
    {
        exc e=new exc();
        e.m1();
        e.m2();
        e.m3();
        e.m4();
    }
  
}