package weeksix;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringOccurence {
	public static void main(String [] args) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		System.out.println("Please enter a line!");
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		calculateCharOccurences(str, map);
		input.close();
	}
	
	public static void calculateCharOccurences(String str, LinkedHashMap<Character, Integer> map)
	{
		char [] strArr = str.toCharArray();
		
		for (char c : strArr) { 
            if (map.containsKey(c)) { 
                map.put(c, map.get(c) + 1);
            } 
            else {  
                map.put(c, 1); 
            } 
        } 
		
        for (Entry<Character, Integer> entry : map.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
}
