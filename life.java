//https://www.hackerearth.com/problem/algorithm/life-the-universe-and-everything/

import java.*;
import java.util.*;

class  life
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t[]=new int[100];
		t[0]=in.nextInt();
		int i=0;
		
		while(t[i]!=42)
		{
			i++;
			t[i]=in.nextInt();
		}
		
		int end=i-1;
		
		for(int z=0;z<=end;z++)
		{
			System.out.println(t[z]);
		}
		
		
	}
}