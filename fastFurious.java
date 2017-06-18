import java.util.Scanner;

class fastFurious
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int p,q;
		int domSpeed[]=new int[n];
		int brianSpeed[]=new int[n];
	
			for(int i=0;i<n;i++)
			{
				domSpeed[i]=in.nextInt();
			}

			for(int i=0;i<n;i++)
			{
				brianSpeed[i]=in.nextInt();
			}

			int maxSpeed1=0;
			int maxSpeed2=0;
			int point1=0;
			int point2=0;

			for(int i=0;i<n-1;i++)
			{
				p=difference(domSpeed[i],domSpeed[i+1]);
				q=difference(brianSpeed[i],brianSpeed[i+1]);

				if(p>maxSpeed1)
				{
					maxSpeed1=p;
					point1=i;
				}

				if(q>maxSpeed2)
				{
					maxSpeed2=q;
					point2=i;
				}
				
			}
			
			if(maxSpeed1>maxSpeed2)
			{
			System.out.println("Dom");
			System.out.println(maxSpeed1);
			}

			else if(maxSpeed1<maxSpeed2)
			{
			System.out.println("Brian");
			System.out.println(maxSpeed2);
			}
			
			else
			System.out.println("Tie");
				
	}
	
	
	public static int difference(int x,int y)
	{
		if(x>y)
		return x-y;
		
		else
		return y-x;
	}
}
