//accept no from user cheak wheter 7th bit is on or off

import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public boolean CheackBit(int iNo)
    {
        int iMask =64;
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
class P194_Chk7thbit
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
