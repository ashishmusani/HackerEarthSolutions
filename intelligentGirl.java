//import java.*;
import java.util.Scanner;

class intelligentGirl
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		String s=in.nextLine();
		int length=s.length();
		int evenList[]=new int[length];
		int even=0;
		
		for(int j=length-1;j>=0;j--)
		{
			if((Character.getNumericValue(s.charAt(j)))%2==0)
			{
				even++;
			}
			
			evenList[j]=even;
		}
		
		
		for(int j=0;j<length;j++)
		{
			System.out.print(evenList[j]+" ");
		}
	}
}