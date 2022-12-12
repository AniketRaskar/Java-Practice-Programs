//accept the string from the user and revrse each wort of it tithlya tith and now display it one after other it append

import java.lang.*;
import java.util.*;

class P310_RevStringwordinplace
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");

        String newstr2 = newstr.trim();

        String arr[] = newstr2.split(" ");

        StringBuffer finalstr = new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            StringBuffer sb = new StringBuffer(arr[i]);
            finalstr.append((sb.reverse()).append(" "));
        }
        //System.out.println(finalstr);
        //trim is not in stringbuffer so once convert it into string 
        String finalstr2 = new String(finalstr);
        System.out.print(finalstr2.trim()); //for removing last space due to append(" ")
        
    }
}