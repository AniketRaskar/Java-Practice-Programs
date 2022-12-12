//Cheak wheather the first nibble and last nibble is on or off

import java.lang.*;
import java.util.*;

class P348_1stAndLastNibble
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        int iMask = 0Xf000000f;
        int iResult =0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("Firt & last nibble of the enterd number is On");
        }
        else
        {
            System.out.println("First & last nibble of the entered number is off.");
        }

    }
}