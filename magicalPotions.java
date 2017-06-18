//https://www.hackerearth.com/problem/algorithm/the-magical-shop/

import java.util.Scanner;
import java.math.BigInteger;

class magicalPotions
{
	public static void main(String args[])
	{
	    Scanner in = new Scanner(System.in);
	    BigInteger A = new BigInteger(String.valueOf(in.nextInt()));
	    BigInteger B = new BigInteger(String.valueOf(in.nextInt()));
	    BigInteger totalPotions = new BigInteger("0");
	    in.nextLine();
        String days = in.nextLine();
        int daysLength = days.length();

        for(int i=0;i<daysLength;i++)
        {
            if(days.charAt(i)=='1')
                totalPotions = totalPotions.add(A);
            A = A.multiply(A);
        }

        totalPotions = totalPotions.mod(B);
        System.out.println(totalPotions);
	}

}
