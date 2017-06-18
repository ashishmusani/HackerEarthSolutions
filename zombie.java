import java.*;
import java.util.*;
class zombie
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int zombie[]=new int[1000];
		int vampires[]=new int[1000];

		int t=in.nextInt();
		int z=0;
		int v=0;
		int n;
		int sum=0;
		
		for(int i=1;i<=t;i++)
		{
			n=in.nextInt();
			if((n%2)==0)
			{
				zombie[z]=n;
				z++;
			}
			else
			{
				vampires[v]=n;
				v++;
			}
		}
		z--;
		v--;
		
		int temp;
		

		for(int i=0;i<=z-1;i++)
		{
			for(int j=0;j<z-1-i;j++)
			{
				if(zombie[j]>zombie[j+1])
				{
					temp=zombie[j];
					zombie[j]=zombie[j+1];
					zombie[j+1]=temp;
				}
			}
		}

		for(int i=0;i<=v-1;i++)
		{
			for(int j=0;j<v-1-i;j++)
			{
				if(vampires[j]>vampires[j+1])
				{
					temp=vampires[j];
					vampires[j]=vampires[j+1];
					vampires[j+1]=temp;
				}
			}
		}






		
		for(int i=0;i<=z;i++)
		{
			System.out.print(zombie[i]+" ");
			sum+=zombie[i];
		}
		
		System.out.print(sum+" ");
		sum=0;

		for(int i=0;i<=v;i++)
		{
			System.out.print(vampires[i]+" ");
			sum+=vampires[i];
		}
		System.out.print(sum+" ");
		
		
	}
}