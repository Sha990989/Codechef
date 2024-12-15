import java.util.*;
import java.lang.*;
import java.io.*;

class icecreamndcone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if((X+Y)>0)
		{
		 int maxIcecream=Math.min(X,Y);   
		 System.out.println(maxIcecream);
		}
		
	}
}
