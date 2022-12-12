//accept the string from the user and find no of words in it
//repacing the multiple whitespaces
//trim method in java 
//trim() method eliminates leading and trailing spaces.
import java.lang.*;
import java.util.*;

class P305_trimMethod
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");//regular expression,it will remove all the whitespaces between the string

        String newstr2 = newstr.trim(); // it will remove all the leading and trailing whitespaces

        String arr[] = newstr2.split(" ");

        System.out.println("number of words are :"+arr.length);
    }
}