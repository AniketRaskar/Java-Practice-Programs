//accept the 2 string from user cheak they are anegram or not
//reducing complexivity
import java.lang.*;
import java.util.*;

class P318_anagram3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first string");
        String str1 = sobj.nextLine();
        str1= str1.toLowerCase();
        char arr[] = str1.toCharArray();
        int Freuquncy1[] = new int[26];
        int i=0;

        System.out.println("Enter second string");
        String str2 = sobj.nextLine();
        str2= str2.toLowerCase();
        char brr[] = str2.toCharArray();
        int Freuquncy2[] = new int[26];
        
        if(str1.length() != str2.length())
        {
            System.out.println("Strings are not anagram as length are different");
            return;
        }
        for(i=0;i<brr.length;i++)
        {
            Freuquncy1[arr[i]-'a']++;
            Freuquncy2[brr[i]-'a']++;
        }

        
        for(i=0;i<Freuquncy1.length;i++)
        {
            if(Freuquncy1[i] != Freuquncy2[i])
            {
                break;
            }
        }
        if(i == 26)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}