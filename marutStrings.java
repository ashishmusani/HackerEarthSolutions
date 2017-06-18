//https://www.hackerearth.com/problem/algorithm/marut-and-strings-4/

import java.util.Scanner;
import java.lang.*;
import java.lang.Character;
class marutStrings
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                upper++;
            else
                lower++;
        }

    System.out.println(upper);
    System.out.println(lower);

    }
}
