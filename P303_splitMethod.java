//accept the string from the user and find no of words in it
//it works for only string contains only one whitespace in between the words,and fails if it contains multiple whitespaces
//.split() method is used for spliting the string the words
import java.lang.*;
import java.util.*;

class P303_splitMethod
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        String arr[] = str.split(" ");  

        System.out.println("number of words are :"+arr.length);
    }
}