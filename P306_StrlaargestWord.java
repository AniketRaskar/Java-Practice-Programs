//accept the string from the user and display largest word from it

import java.lang.*;
import java.util.*;

class P306_StrlaargestWord
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine(); //taking the input

        String newstr = str.replaceAll("\\s+"," ");   //replacing all the spaces in between
        String newstr2= newstr.trim();  //removing all the trailing and leadding spaces

        String arr[] = newstr2.split(" ");  //spliting into words

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}