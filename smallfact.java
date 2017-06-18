import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.*;
import java.util.*;
import java.math.BigInteger;

public class smallfact
{
    public static void main(String args[])
{
	
	Scanner in=new Scanner(System.in);
	int t,n;
	int i,j;
	

	t=in.nextInt();

	BigInteger array[] = new BigInteger[t+1];

	int list[]=new int[t+1];

	for(i=1;i<=t;i++)
	{
		list[i]=in.nextInt();
	}


	for(i=1;i<=t;i++)
	{
		array[i] = BigInteger.ONE;
		for(j=1;j<=list[i];j++)
		{
			BigInteger bi = BigInteger.valueOf(j);
			array[i] = array[i].multiply(bi) ;
		}
		System.out.println(array[i]);
	}

}
}
