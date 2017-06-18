import java.util.Scanner;
import java.util.Arrays;

class promNight
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		
		String ans[]=new String[t];
		
		for(int i=0;i<t;i++)
		{
			int m=in.nextInt();
			int n=in.nextInt();
			
			int boys[]=new int[m];
			int girls[]=new int[n];

				for(int j=0;j<m;j++)
				{
					boys[j]=in.nextInt();
				}
				for(int j=0;j<n;j++)
				{
					girls[j]=in.nextInt();
				}
			
			if(m>n)
			{
				ans[i]="NO";
				break;
			}
			else
			{
				
				Arrays.sort(boys);
				Arrays.sort(girls);

				boolean flag=false;


				int b=0;
				int g=0;
				
				while(boys[0]>=girls[g])
				g++;

				if(m>(n-g))
				ans[i]="NO";
				


				else
				{
					for(int j=0;j<m;j++)
					{
						
						if(boys[j]<=girls[g])
						{
						flag=true;
						break;
						}
						else
						g++;
	
					}
					if(flag==true)
					ans[i]="YES";
					else
					ans[i]="NO";
				}
			}
			
		}
		
		for(int i=0;i<t;i++)
		
		System.out.println(ans[i]);
	}
}