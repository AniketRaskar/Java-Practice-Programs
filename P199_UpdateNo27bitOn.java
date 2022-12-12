//accept the no from user and display the updated number when 27th bit  is on
import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
        int iMask =0X04000000;  //67108864
        int iResult =0;
        
    iResult = iNo | iMask;
    return iResult;
    }
     
    
}
class P199_UpdateNo27bitOn
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        int iret = bobj.OnBit(value);
        System.out.println("Updated number is :"+iret);
        
      
    }
}
