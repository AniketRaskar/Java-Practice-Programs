//accept the string from the user and revrse each wort of it tithlya tith

import java.lang.*;
import java.util.*;

class P309_RevWordinplace
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");

        String newstr2 = newstr.trim();

        String arr[] = newstr2.split(" ");
        //as string is imutabble we can't do it reverse directly, 1st take it into stringBuffer or stringBuilder
        for(int i=0;i<arr.length;i++)
        {
            //StringBuffer sb = new StringBuffer(arr[i]);
            StringBuilder sbl = new StringBuilder(arr[i]);
            //System.out.println(sb.reverse());
            System.out.println(sbl.reverse());
        }
        
    }
}