//Accept the number from the user and display the comman on bits
import java.lang.*;
import java.util.*;

class P353_Dis_Comm_onBits
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo1 = sobj.nextInt();
        System.out.println("Enter the second number:");
        int iNo2 = sobj.nextInt();

        int iMask = 0X00000001;
        int iResult1 =0;
        int iResult2 =0;

        for(int i=1;i<=32 ;i++)
        {
            iResult1 = iNo1 & iMask;
            iResult2 = iNo2 & iMask;
            if((iResult1 == iMask)&&(iResult2==iMask))
            {
                System.out.println(i);
            }
            iMask = iMask << 1;
        }
    }
}