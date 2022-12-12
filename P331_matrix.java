//Accept input for matrix from the user in OOP format

import java.lang.*;
import java.util.*;
import MarvellousMatrix.Matrix;


public class P331_matrix
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int X = sobj.nextInt();

        System.out.println("Enter the number of columns:");
        int Y = sobj.nextInt();

        matrix mobj = new matrix(X, Y);
        mobj.Accept();
        mobj.Display();
   
    }
}