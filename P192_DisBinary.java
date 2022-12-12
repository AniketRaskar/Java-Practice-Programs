import java.lang.*;
import java.util.Scanner;
import java.util.*;
//accept the number from the user and give it's binary number
class Bitwise
{
    public void DisplayBinary(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo /2;
        }
        System.out.println();

    }
}
class P192_DisBinary
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int value = sobj.nextInt();

        Bitwise bobj = new Bitwise();
        bobj.DisplayBinary(value);
      
    }
}