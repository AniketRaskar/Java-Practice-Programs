//input : 78956
/*
 78956
 78956
 78956
 78956
 */

import java.lang.*;
import java.util.*;

class P342_IntToStrpattern
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the number");
     int no=sobj.nextInt();

     String str = Integer.toString(no); //Conversion of integer to string
     char Arr[] = str.toCharArray();
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