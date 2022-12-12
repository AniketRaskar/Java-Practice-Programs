//accept the string with aslo char+speci.char and display freqency of them
import java.lang.*;
import java.util.*;
public class p357_freq_hashmap_key
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
    for(char ch:setobj)
    {
        System.out.println(ch+" Occurs "+map.get(ch)+" times.");
    }
 }   
}
