//https://www.hackerearth.com/problem/algorithm/trailing-zeros/

import java.util.Scanner;
import java.math.BigInteger;


class trailingZeroes
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(str);
        BigInteger ans = new BigInteger("1");
        BigInteger I = new BigInteger("1");
        BigInteger uni = new BigInteger("1");


       for(int i=1;i<=n;i++)
       {
           ans=ans.multiply(I);
           I=I.add(uni);
       }


        String ANS = new String();
        ANS=ans.toString();


        int noOfZero = 0;
        int l = ANS.length();
        l--;

        while(ANS.charAt(l)=='0')
        {
            noOfZero++;
            l--;
        }
        System.out.println(noOfZero);
	}

}
