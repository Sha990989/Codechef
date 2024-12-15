import java.util.*;
import java.lang.*;
import java.io.*;

class clearday
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int week=7;
        int res=X+Y;
        int clear=week-res;
        System.out.println(clear);
	}
}
