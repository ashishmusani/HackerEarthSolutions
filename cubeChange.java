//https://www.hackerearth.com/problem/algorithm/cube-change-qualifier2/

import java.util.Scanner;


class cubeChange
{
    public static void main(String args[])
    {
		Scanner in = new Scanner(System.in);
		int totalCubes=0;
		
		int t = in.nextInt();
		
		int n[] = new int[t];
		
		for(int i=0;i<t;i++)
		n[i] = in.nextInt();
		

		for(int i=0;i<t;i++)
		{
			totalCubes = 2*(n[i])*(n[i])+2*((n[i])-2)*((n[i])-2)+2*((n[i])-4)*((n[i])-4);
			System.out.println(totalCubes);
			totalCubes=0;
		}

    }
}
