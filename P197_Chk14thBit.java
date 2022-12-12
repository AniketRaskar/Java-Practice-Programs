//check wheather 14 th bit in on or off
import java.lang.*;
import java.util.Scanner;
import java.util.*;

// 0000 0000 0000 0000 0010 0000 0000 0000
//  0     0   0    0    2    0    0     0
class Bitwise
{
    public boolean CheackBit(int iNo)
    {
        int iMask =0X00002000;   //8192   (14th pos)
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
class P197_Chk14thBit
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
