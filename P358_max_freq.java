//accept the string with aslo char+speci.char and find maximum frequency of and the char of string
import java.lang.*;
import java.util.*;
public class P358_max_freq
{
 public static void main(String[] args) 
 {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the String :");
    String Str = sobj.nextLine();

    char Arr[] = Str.toCharArray();

    HashMap <Character,Integer> map = new HashMap<>();

    int frequency =0;
    for(char ch :Arr)
    {
        if(map.containsKey(ch))
        {
            frequency = map.get(ch);
            map.put(ch,frequency+1);
        }
        else
        {
            map.put(ch,1);
        }
    }
    Set <Character> setobj = map.keySet();
    int iMax =0;
    char c = ' ';
    for(char ch:setobj)
    {
        if(map.get(ch)>iMax)
        {
            iMax = map.get(ch);
            c = ch;
        }
    }
    System.out.println(c +" Occours maximum numbers of times ie. :"+ iMax);
 }   
}
