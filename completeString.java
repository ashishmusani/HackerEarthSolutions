import java.*;
import java.util.*;
import java.util.Arrays;

class completeString
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		String str[]=new String[t];
		int flag;
		int alphabet[]=new int[26];
		int length;


	for(int l=0;l<t;l++)		//to clear strings' array
	{
		str[l]="";
	}



	for(int k=0;k<t;k++)
	{
		str[k]=in.nextLine();
	}


	for(int k=0;k<t;k++)
	{

		flag=1;
		Arrays.fill(alphabet, 0);
		length=str[k].length();
		
		for(int i=0;i<length;i++)
		{
			if(str[k].charAt(i)<=90)
			alphabet[(str[k].charAt(i))-65]=1;

			else
			alphabet[(str[k].charAt(i))-97]=1;

		}

		for(int j=0;j<26;j++)
		{
			if(alphabet[j]==0)
			{
			flag=0;
			break;
			}
		}

		if (flag==1)
		System.out.println("YES");
		else
		System.out.println("NO");

	}
	}
}