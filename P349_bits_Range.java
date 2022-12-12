//Accept the number from the user and chk the bits within the range on or off
import java.lang.*;
import java.util.*;

class P349_bits_Range
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        System.out.println("Enter the starting index of range");
        int iStart = sobj.nextInt();

        System.out.println("Enter the ending index of the range");
        int iEnd = sobj.nextInt();

        int iMask1 = 0Xfffffff;
        int iMask2 = 0Xfffffff;
        int iMask =0;

        //System.out.println(iMask1);
        iMask1 = (iMask1 << (iStart -1));
        //System.out.println(iMask1);
        iMask2 = (iMask2 >> (32 - iEnd));

        int iResult =0;
        
        iMask = iMask1 & iMask2;
        //System.out.println(iMask1 & iMask2);
        //iMask = 0x00000007;
        //System.out.println(iMask);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("Bits are on of the enterd number within the entred range");
        }
        else
        {
            System.out.println("Bits are off of the enterd number within the entred range");
        }

    }
}