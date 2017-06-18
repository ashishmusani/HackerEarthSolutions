
import java.util.Scanner;

class gf
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int length=str.length();
		int q;
		q=in.nextInt();
		long a,b;
		String ans=new String();
		
		for(int i=0;i<q;i++)
		{
			a=in.nextLong();
			b=in.nextLong();
			a--;
			b--;
			if((str.charAt((int)(a%length)))==(str.charAt((int)(b%length))))
			ans+="Yes\n";
			else
			ans+="No\n";

		}

		System.out.println(ans);
	}
}


















working submitted and copied code below

import java.util.Scanner;
 
public class TestClass {
 
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String input = read.next();
		long t = read.nextInt();
		StringBuilder result = new StringBuilder();
		for(long testCase=1;testCase<=t;testCase++){
        	long a,b;
        	
        	a = read.nextLong();
        	b = read.nextLong();
        	a--;
        	b--;
        	a %= input.length();
        	b %= input.length();
			int a1 = (int)a;
			int b1 = (int)b;
        		if(input.charAt(a1) == input.charAt(b1))
        			result.append("Yes"+"\n")  ;
        		else
        			result.append("No"+"\n") ;
        	
        	
        }
        System.out.println(result);
	}
 
}