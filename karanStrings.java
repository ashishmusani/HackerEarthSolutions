import java.util.Scanner;

class karanStrings
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int t=in.nextInt();
		
		in.nextLine();
		
		String ans[]=new String[t];
		
		for(int T=0;T<t;T++)
		{
			String original=in.nextLine();
			String modified=new String();
			int length=original.length();
			
			modified+=original.charAt(0);
		
			int j=0;
			
			for(int i=1;i<length;i++)
			{
				if((original.charAt(i))!=(modified.charAt(j)))
				{
				modified+=original.charAt(i);
				j++;	
				}
				
			}
			
			ans[T]=modified;
		}
		
		for(int i=0;i<t;i++)
		System.out.println(ans[i]);
	}
}