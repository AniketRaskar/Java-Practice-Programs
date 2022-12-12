//Accept input for matrix from the user in OOP format
import java.util.*;
import MarvellousMatrix1.*;

class MyMatrix extends matrix
{
    public MyMatrix(int a,int b)
    {
        super(a,b);
    }
    public int Maximun()
    {
        int iMax = Arr[0][0];
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(Arr[i][j]>iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }
}
public class P332_matrixLargestEle
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int X = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        int Y = sobj.nextInt();

        MyMatrix mobj = new MyMatrix(X, Y);
        mobj.Accept();
        mobj.Display();

        int iRet=mobj.Maximun();
        System.out.println("MAximum element is:"+iRet);
   
    }
}