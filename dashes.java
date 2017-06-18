//https://www.hackerearth.com/problem/algorithm/what-is-the-string-made-of-2/

import java.*;
import java.util.*;

class dashes
{

	static int method(int x)
	{
		int r;
		int ans=0;

	while(true)
	{
			r=x%10;
			x/=10;

		switch(r)
		{

		case 1:
		ans+=2;
		break;

		case 2:
		ans+=5;
		break;

		case 3:
		ans+=5;
		break;

		case 4:
		ans+=4;
		break;

		case 5:
		ans+=5;
		break;

		case 6:
		ans+=6;
		break;

		case 7:
		ans+=3;
		break;

		case 8:
		ans+=7;
		break;

		case 9:
		ans+=6;
		break;

		case 0:
		ans+=6;
		break;



		} //switch ends

	if(x==0)
	{
		break;
	}

	}

	return ans;
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		int answer=method(n);
		System.out.println(answer);
	}
}