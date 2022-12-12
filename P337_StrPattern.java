//input : Hello
/*
  H   e   l   l   o
  H   e   l   l   o
  H   e   l   l   o
  H   e   l   l   o
  H   e   l   l   o
 */

 import java.lang.*;
 import java.util.*;

 class P337_StrPattern
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
          System.out.print(Arr[j]+"\t");
        }
        System.out.println();
      }
    }
 }