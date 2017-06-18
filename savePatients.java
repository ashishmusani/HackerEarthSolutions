//https://www.hackerearth.com/problem/algorithm/save-patients/

import java.util.Scanner;
import java.util.Arrays;
class savePatients
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int strOfVac[] = new int [n];
		int medInPatient[] = new int [n];
		
		
		for(int i=0;i<n;i++)
		{
			strOfVac[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			medInPatient[i]=in.nextInt();
		}
		Arrays.sort(strOfVac);
		Arrays.sort(medInPatient);
		
		boolean flag=true;
		for(int j=0;j<n;j++)
		{
			if(strOfVac[j]<=medInPatient[j])
			{
				flag=false;
				break;
			}
		}
		
		if(flag==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}