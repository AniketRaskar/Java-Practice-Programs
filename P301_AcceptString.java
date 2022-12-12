//accept the string from the user and find no of small case letter in it
import java.lang.*;
import java.util.*;

class P301_AcceptString
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();//in java there in no /0 in string array

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}