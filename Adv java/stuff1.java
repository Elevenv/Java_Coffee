import java.util.*;
class stuff1
{
    public static void main(String args[])
    {
        int n,low1,temp;
        System.out.println("Enrter No of Elements:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:\n");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt(); 
        Arrays.sort(arr);
        var low = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==low)
            {
                low=low+1;
            }
            if(low==0 || low<=0)
            low++;
        }
        System.out.println("Answer is:"+low);
    }
}