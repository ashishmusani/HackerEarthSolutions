//https://www.hackerearth.com/problem/algorithm/upup/

import java.util.Scanner;
import java.lang.*;
import java.util.*;

class upUp
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();


        System.out.print(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)== ' ')
            {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
            else
                System.out.print(str.charAt(i));
        }
    }
}
