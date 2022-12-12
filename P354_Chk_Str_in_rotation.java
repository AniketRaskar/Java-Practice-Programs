//Accept the two string from user and chk wheather they are in rotation or not.
import java.lang.*;
import java.util.*;

class P354_Chk_Str_in_rotation
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Original String:");
        String str1 = sobj.nextLine();

        System.out.println("Enter the string which we have to chk:");
        String str2 = sobj.nextLine();

        String str3 = str1 + str1;

        if(str3.contains(str2))//Chk wheather substring is present in the string or not
        {
            System.out.println("Entered string is in rotation.");
        }
        else
        {
            System.out.println("Entered string is not in rotation.");
        }
    }
}