class cons
{
    cons()
    {
        System.out.println("this is cons.");
    }
    cons(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition is:"+c);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[3]=3;
        arr[4]=4;
        System.out.println(arr[0]);


    }
        public static void main(String args[])
        {
            new cons();
            new cons(4,5);
        }
}