//return addition of all matrix elements
import java.lang.*;
import java.util.*;


class P324_AddMatrix
{
    public static void main(String arg[])
    {  
        int i=0,j=0,iSum=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int irow = sobj.nextInt();

        System.out.println("Enter number of rows");
        int icol = sobj.nextInt();

        int Arr[][] = new int[irow][icol];

        System.out.println("Enter the elements");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                iSum = iSum+Arr[i][j];
            }
           
        }
        System.out.println("Addition is :"+iSum);
    }
}