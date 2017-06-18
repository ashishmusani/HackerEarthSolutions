//https://www.hackerearth.com/problem/algorithm/all-vowels-2/


import java.util.Scanner;

class allVowels
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		boolean a=false,e=false,i=false,o=false,u=false;
		
		int n=in.nextInt();
		in.nextLine();
		
		String str=in.nextLine();
		
		for(int k=0;k<str.length();k++)
		{
			if((str.charAt(k))=='a')
				a=true;
			else if((str.charAt(k))=='e')
				e=true;
			if((str.charAt(k))=='i')
				i=true;
			if((str.charAt(k))=='o')
				o=true;
			if((str.charAt(k))=='u')
				u=true;

		}
		
		if(a&&e&&i&&o&&u)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}