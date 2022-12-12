//input : 79959
//output: 3
/*
 7+9+9+5+9   39
 3+9    12
 1+2   3
 3

 */

import java.lang.*;
import java.util.*;

class P346_digitSSumGRTthan10
{
   public static void main(String[] args) 
   {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Enter the number");
     int no=sobj.nextInt();

     int iSum=0,iDigit=0;
     while(true)
     {
        while(no != 0)
        {
            iDigit = no%10;
            iSum =iSum+iDigit;
            no = no/10;
        }
        no=iSum;
        iSum=0;
        if(no<10)
        {
            break;
        }
    }
    System.out.println("Sum is "+no);
     
     

     
   }
}