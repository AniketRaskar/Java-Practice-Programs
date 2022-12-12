//accept 2 string from user and cheack wheather it is anagram or not (case inssensitive)
//eg. listen and slient,race & care
//here only diaplaying freuquncy of each letter in the word without assci value for any value eighter small or upper case
//display only letters present in the string

import java.lang.*;
import java.util.*;

class P314_DisFreqOfLetter4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        str= str.toLowerCase();
        char arr[] = str.toCharArray();
        int Freuquncy[] = new int[26];
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            Freuquncy[arr[i]-'a']++;
        }

        for(i=0;i<Freuquncy.length;i++)
        {
            if(Freuquncy[i]>0)
            {
                System.out.println((char)(i+'a')+" : "+Freuquncy[i]);
            }
        }

        
    }
}