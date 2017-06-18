//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/


import java.util.*;
import java.math.*;

class findProduct {
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        
		BigDecimal ip[] = new BigDecimal[N];
		
		BigDecimal n1 = new BigDecimal(10E+9 + 7);
		
		
		BigDecimal ans = new BigDecimal(1);

        for (int i = 0; i < N; i++) 
        {
            ip[i] = new BigDecimal(s.nextInt());
        }
        
        for (int i = 0; i < N; i++) 
        {
			ans = ans.multiply(ip[i]);
			ans = ans.remainder(n1);
        }
		
			System.out.println(ans);

    }
}
