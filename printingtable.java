import java.util.*;
public class printingtable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int res=N*i;
            System.out.println(N +" x "+i +" = "+ res);
        }
    }
}