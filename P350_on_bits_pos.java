//Accept the number from the user and display which position are on
import java.lang.*;
import java.util.*;

class P350_on_bits_pos
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sobj.nextInt();

        int iMask = 0X00000001;
        int iResult =0;

        
        for(int i=1;i<=32 ;i++)
        {
            iResult = iNo & iMask;
            if(iResult == iMask)
            {
                System.out.println(i);
            }
            iMask = iMask << 1;
        }

    }
}