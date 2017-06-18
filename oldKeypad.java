//https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/algorithm/old-keypad-in-a-foreign-land-24/

import java.util.*;

class oldKeypad
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		

		String freqString[] = (in.nextLine()).split(" ");				
		int freqInt[] = new int[freqString.length];
		for(int i=0; i<freqInt.length; i++)
			freqInt[i] = Integer.parseInt(freqString[i]);		

		
		int K = Integer.parseInt(in.nextLine());
		String keyString[] = (in.nextLine()).split(" ");		
		int keyInt[] = new int[keyString.length];
		for(int i=0; i<keyInt.length; i++)
			keyInt[i] = Integer.parseInt(keyString[i]);
		
		Arrays.sort(freqInt);
	
		int hits = 0;
		
		int taps = 1;
		
		int pointer = 0;
		
		int totalSpace=0;
		
		for(int k=0;k<K; k++)
			totalSpace += keyInt[k];
		
		if(N>totalSpace)
			System.out.println("-1");
		
		else
		{
			for(int x=N-1; x>=0; x--)
			{			
				while((pointer<K)&&(keyInt[pointer] == 0))
					pointer++;
				if(pointer == K)
				{
					break;
				}
				keyInt[pointer]--;
				hits += (freqInt[x]*taps);
				pointer++;
				if(pointer == K)
				{
					pointer = 0;
					taps++;
				}	
			}
			
			System.out.println(hits);
		}
	}
}