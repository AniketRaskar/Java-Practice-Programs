import java.lang.*;
import java.util.Scanner;
import java.util.*;
//accept the number from the user and cheak wheather it's corresponding bit is on or off

class Bitwisea
{
    public boolean CheackBit(int iNo)
    {
        int iMask =0X00100000;  //1048576
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
class P196_Bitwise
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
