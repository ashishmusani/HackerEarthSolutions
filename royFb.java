import java.*;
import java.util.*;

class royFb
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int l,n;

		l=in.nextInt();

		n=in.nextInt();

		int w[]=new int[n];		
		int h[]=new int[n];		


		for(int i=0;i<n;i++)
		{
			w[i]=in.nextInt();
			h[i]=in.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			if((w[i]<l)||(h[i]<l))
			{
				System.out.println("UPLOAD ANOTHER");
			}

			else if((w[i]>=l)&&(h[i]>=l)&&(w[i]==h[i])
			{
				System.out.println("ACCEPTED");
			}

			else
			{
				System.out.println("CROP IT");
			}

		}

	}

}