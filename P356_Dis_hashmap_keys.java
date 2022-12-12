//accept the string with aslo char+speci.char and find the frequency of them
import java.lang.*;
import java.util.*;
public class P356_Dis_hashmap_keys
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
    System.out.println(setobj);
 }   
}
