//package MarvellousMatrix1;
import java.lang.*;
import java.util.*;

class matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];
    public matrix(int a,int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    /*protected void finalize()
    {
        Arr = null;
        System.gc();
    }*/

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the data:");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are:");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
