//accept the no from user as well as accept position from user and toggle the bit at that pos and return the no
import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo,int iPos)
    {
        int iMask = 0X00000001;
        int iResult =0;

        iMask = iMask << (iPos -1);
        iResult = iNo ^ iMask;
        return iResult;
    }
    
}
class P203_togleNthBit
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = sobj.nextInt();
        System.out.println("Enter the bit pos:");
        int pos = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret=bobj.ToggleBit(value, pos);
        System.out.println("Updated number is:"+iret);
        
        
      
    }
}
