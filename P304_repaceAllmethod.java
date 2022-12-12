//accept the string from the user and find no of words in it
//repacing the multiple whitespaces
//trim method in java in text code for startinng and ending spaces
//replaceAll() method replaces all the squence  of characters matching the regex with replacement text,  it can remove all the whitespaces in between the string but not the leading and trailing spaces.
import java.lang.*;
import java.util.*;

class P304_repaceAllmethod
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String newstr = str.replaceAll("\\s+"," ");//regular expression
        String arr[] = newstr.split(" ");

        System.out.println("number of words are :"+arr.length);
    }
}