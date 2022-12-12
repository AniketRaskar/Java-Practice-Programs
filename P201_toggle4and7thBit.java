//accept the no from user and toggle 4th &7th bit of that no
import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
        int iMask =0X00000048;  //8
        int iResult =0;
        
    iResult = iNo ^ iMask;
    return iResult;
    }
     
    
}
class P201_toggle4and7thBit
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
