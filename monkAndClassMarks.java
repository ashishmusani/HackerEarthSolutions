//https://www.hackerearth.com/problem/algorithm/the-monk-and-class-marks/

import java.util.Scanner;
import java.util.*;

class monkAndClassMarks
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		
		int n=in.nextInt();
		String names[] = new String [n];
		int marks[] = new int [n];
		
		
		in.nextLine();					//flush

		for(int i=0;i<n;i++)
		{
			String str=in.nextLine();
			String[] parts=str.split(" ");
			names[i]=parts[0];
			marks[i]=Integer.parseInt(parts[1]);
		}		
		
		
		for(int i=0;i<(n-1);i++)
		{
			for(int j=0;j<=(n-i-2);j++)
			{
				if(marks[j]<=marks[j+1])
				{
					if(marks[j]==marks[j+1])
					{
						if((names[j].compareTo(names[j+1]))>0)
						{
							int temp=marks[j];
							marks[j]=marks[j+1];
							marks[j+1]=temp;
							String tempName=names[j];
							names[j]=names[j+1];
							names[j+1]=tempName;
						}
					}
					else
					{
						int temp=marks[j];
						marks[j]=marks[j+1];
						marks[j+1]=temp;
						String tempName=names[j];
						names[j]=names[j+1];
						names[j+1]=tempName;	
					}
				}
			}
		}
		
		for(int z=0;z<n;z++)
		{
			System.out.println(names[z]+" "+marks[z]);
		}
	}
}