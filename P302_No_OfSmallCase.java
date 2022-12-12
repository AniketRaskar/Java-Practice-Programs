//accept the string from the user and find no of small case letter in it
import java.lang.*;
import java.util.*;

class P302_No_OfSmallCase
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();//in java there in no /0 in string array

        int iCnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >='a' && arr[i]<='z')
            {
                iCnt++;
            }
        }

        System.out.println("NUmber of small case letters are:"+iCnt);
    }
}