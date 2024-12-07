import java.util.*;
public class finddigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int org=n;
            int c=0;
            while(n>0)
            {
                int digit=n%10;
                if(digit!=0 && (org%digit)==0)
                c++;
                n/=10;
            }
            System.out.println(c);
        }
    }
}