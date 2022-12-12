import java.lang.*;
import java.util.Scanner;
import java.util.*;
//accept the number from the user and cheak wheather it's bits of no 4 is is on or off 
class Bitwise
{
    public boolean CheackBit(int iNo)
    {
        int iMask =4;
        int iResult =0;
        
    iResult = iNo & iMask;
    if(iResult == 0)
    {
        return false;
    }
    else
    {
        return true;
    }

    }
}
class P193_ChkBitOnOff
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        boolean bret = bobj.CheackBit(value);

        if((bret ==true))
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }
      
    }
}
