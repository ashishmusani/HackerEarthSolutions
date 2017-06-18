import java.util.Scanner;

class monkFood
{
	int price;
	
	monkFood(int p)
	{
		price=p;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int q=in.nextInt();
		
		monkFood list[]=new monkFood[q];
		int pointer=0;
		String ans[]=new String[q];
		
		
		for(int i=0;i<q;i++)
		{
			int z=in.nextInt();
			
			if(z==1)
			{
				if(pointer!=0)
				{
					ans[i]=String.valueOf(list[pointer].price);
					pointer--;
				}
				
				else
				{
					ans[i]="No Food";
				}
			}
			
			else if(z==2)
			{
				pointer++;
				int Pprice=in.nextInt();
				list[pointer]=new monkFood(Pprice);
			}
		}
		
		for(int i=0;i<q;i++)
		{
		if(ans[i]!=null)
		System.out.println(ans[i]);
		}
	}
}