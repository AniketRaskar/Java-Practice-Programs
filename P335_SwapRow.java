import java.lang.*;
import java.util.*;

class P335_SwapRow
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int X = sobj.nextInt();

        System.out.println("Enter number of columns");
        int Y = sobj.nextInt();

        MyMatrix mobj  = new MyMatrix(X,Y);
        mobj.Accept();
        mobj.Display();

        mobj.SwapRow();
        System.out.println("Data after swapping is :");
        mobj.Display();

    }
}
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
class MyMatrix extends matrix
{
        public MyMatrix(int a, int b)
        {
            super(a,b);
        }

        public void SwapRow()
        {
            int iTemp = 0;

            for(int i = 0; i < iRow-1; i+=2)
            {
                for(int j = 0; j< iCol;j++)
                {
                        iTemp = Arr[i][j];
                        Arr[i][j] = Arr[i+1][j];
                        Arr[i+1][j] = iTemp;
                }
            }
        }
}

