//accept the no from user and display the bit on 4th bit
import java.lang.*;
import java.util.Scanner;
import java.util.*;

class Bitwise
{
    public int OnBit(int iNo)
    {
        int iMask =0X00000008;  //8
        int iResult =0;
        
    iResult = iNo & iMask;
    return iResult;
    }
     
    
}
class P198_Dis4thBit
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
