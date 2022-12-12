//accept the no from user as well as accept position from user and toggle the bit at that pos and return the no with filter if pos is greater than 32 or less than 1
import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo,int iPos)
    {
        if((iPos <=0) || (iPos >32))
        {
            System.out.println("Invalid Position");
            return 0;
        }
        int iMask = 0X00000001;
        int iResult =0;

        iMask = iMask << (iPos -1);
        iResult = iNo ^ iMask;
        return iResult;
    }
    
}
class P204_togleInPlace
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
