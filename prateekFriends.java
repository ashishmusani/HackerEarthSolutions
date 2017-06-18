import java.util.Scanner;

class prateekFriends
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		String ans[]=new String[t];
		
		for(int T=0;T<t;T++)
		{
			boolean flag=false;
			int n=in.nextInt();
			int cash=in.nextInt();
			
			int friends[]= new int[n];
			
			for(int i=0;i<n;i++)
			{
				friends[i]=in.nextInt();
			}
			
			for(int c=0;c<n;c++)
			{
				long sum=0;

				for(int c2=c;c2<n;c2++)
				{
					sum+=friends[c2];
					
					if(sum>cash)
					{
						ans[T]="NO";
						break;
					}
					
					else if(sum==cash)
					{
						ans[T]="YES";
						flag=true;
						break;
					}
				}
				
				if(flag==true)
				break;
				
				else
				ans[T]="NO";

			}
		}
		
		for(int i=0;i<t;i++)
		System.out.println(ans[i]);
	}
}