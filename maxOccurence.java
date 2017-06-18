//https://www.hackerearth.com/problem/algorithm/maximum-occurrence-9/

import java.util.Scanner;

class maxOccurence
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		String str=in.nextLine();
		
		int character[]=new int[150];
		
		for(int i=0; i<(str.length());i++)
		{
			(character[(str.charAt(i))])++;
		}

		int max=0;
		int max2=0;
		char ans=(char)0;
		char ans2=(char)1;
		
		for(int i=0; i<150;i++)
		{
			if(character[i]>max)
			{
				max=character[i];
				ans=(char)i;
			}
			else if(character[i]==max)
			{
				max2=max;
				ans2=ans;
				max=character[i];
				ans=(char)i;

			}
		}
		
		
		if(max==max2)
		{
			if(ans<ans2)
			{
				System.out.println(ans+" "+max);

			}
			else
			{
				System.out.println(ans2+" "+max2);
				
			}
		}
		else
		{
			System.out.println(ans+" "+max);
		}
	}

}