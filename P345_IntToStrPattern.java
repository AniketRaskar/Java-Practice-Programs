//input : 78956
/*
 78956
 7895
 789
 78
 7
 */

import java.lang.*;
import java.util.*;

class P345_IntToStrPattern
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the number");
     int no=sobj.nextInt();

     char Arr[] =(Integer.toString(no)).toCharArray();
    for(int i=Arr.length-1;i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print(Arr[j]+"\t");
        }
        System.out.println();
    }  
   }
}