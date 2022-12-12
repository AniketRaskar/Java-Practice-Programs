//input : Hello
/*
  H 
  H e 
  H e l 
  H e l l 
  H e l l o
 */

import java.lang.*;
import java.util.*;

class P339_StrPattern
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the string");
     String str=sobj.nextLine();

     char Arr[]=str.toCharArray();

     for(int i=0;i<str.length();i++)
     {
       for(int j=0;j<=i;j++)
       {
         System.out.print(Arr[i]+"\t");
       }
       System.out.println();
     }
   }
}