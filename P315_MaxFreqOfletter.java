//accept string from user and display such a letter which occurs maximun no of time

import java.lang.*;
import java.util.*;

class P315_MaxFreqOfletter
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

        int iMax=0,iPos=0;
        for(i=0;i<Freuquncy.length;i++)
        {
           if(Freuquncy[i] >iMax)
           {
            iMax = Freuquncy[i];
            iPos =i;
           } 
        }
        System.out.println(((char)(iPos+'a'))+" occurs "+ iMax + " number of times in the word");
        
    }
}