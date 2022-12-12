//input : Hello
/*
  H H H H H
  e e e e e
  l l l l l
  l l l l l
  o o o o o
 */

import java.lang.*;
import java.util.*;

class P338_StrPattern
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the string");
     String str=sobj.nextLine();

     char Arr[]=str.toCharArray();

     for(int i=0;i<str.length();i++)
     {
       for(int j=0;j<str.length();j++)
       {
         System.out.print(Arr[i]+"\t");
       }
       System.out.println();
     }
   }
}