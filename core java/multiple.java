interface asd
{
    void show();
}
interface qwe
{
    void show1();
}
class tp21 implements asd,qwe
{
    public void show()
    {
        System.out.println("123");
    }
    public void show1()
    {
        System.out.println("asdfg");
    }
    void show2()
    {
        System.out.println("asdf");
    }
}
class multiple
{
    public static void main(String args[])
    {
    tp21 t=new tp21();
    t.show();
    t.show1();
    t.show2();
}
}