import java.*;
import java.util.*;

class chandu {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		String original=new String();
		String reverse[]=new String[t];

	for(int k=0;k<t;k++)
	{
		reverse[k]="";
	}

	for(int j=1;j<=t;j++)
	{
		original=in.nextLine();
		int length=original.length();



		for(int i=length-1;i>=0;i--)
		{
			reverse[j-1]+=original.charAt(i);
		}
	}
	for(int j=1;j<=t;j++)
	{
		System.out.println(reverse[j-1]);
	}

	}
}
