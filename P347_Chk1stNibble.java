//Cheak wheather the first nibble is completely on or off

import java.lang.*;
import java.util.*;

class P347_Chk1stNibble
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        int  iMask = 0X0000000f;
        int iResult =0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("Firt nibble of the enterd number is On");
        }
        else
        {
            System.out.println("First nibble of the entered number is off.");
        }

    }
}