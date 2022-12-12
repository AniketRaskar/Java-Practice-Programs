//input : 78956
/*
 78956
 78956
 78956
 78956
 */

import java.lang.*;
import java.util.*;

class P343_IntToStrPattern2
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the number");
     int no=sobj.nextInt();

     //String str = Integer.toString(no);
     char Arr[] =(Integer.toString(no)).toCharArray();
    for(int i=0;i<Arr.length;i++)
    {
        for(int j=0;j<Arr.length;j++)
        {
            System.out.print(Arr[j]+"\t");
        }
        System.out.println();
    }

     
   }
}