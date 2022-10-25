import java.util.*;
class krishnamurthy
{ 
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
    while(num!=0)
        {
            int d=num%10;
            int fact=1;
            for(int i=1;i<=d;i++)
                fact=fact*i;
            sum=sum+fact;
            num=num/10;
            
            
        }
    if(sum==num1)
       System.out.println("it is a Krishnamurthy number");
    else
       System.out.println("not a krishnamurthy number");
    }
}