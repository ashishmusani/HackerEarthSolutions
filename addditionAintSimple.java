//https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/addition-aint-simple/

import java.util.*;

class addditionAintSimple
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		int N = in.nextInt();
		in.nextLine();

		for(int i=0; i<N; i++)
		{
			char str1[] = new char[100000];
			char str2[] = new char[100000];
			
			String str = in.nextLine();
			
			str1 = str.toCharArray();
			
			str2 = new StringBuffer(str).reverse().toString().toCharArray();
			
			
			for(int k=0; k<str1.length; k++)
			{
				str1[k] = toChar((toInt(str1[k]) + toInt(str2[k])+ 1)%26);
			}
			System.out.println(str1);
		}
	}
	
	static int toInt(char c)
	{
		return c - 'a';
	}
	
	static char toChar(int a)
	{
		return (char)(a + 'a');
	}
}