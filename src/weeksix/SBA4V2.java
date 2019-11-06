package weeksix;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//import java.util.LinkedHashMap;

public class SBA4V2 {
	/* StringCompression
	 * Intuition

		We will use separate pointers read and write to mark where we are reading and writing from. 
		Both operations will be done left to right alternately: we will read a contiguous group of characters, 
		then write the compressed version to the array. At the end, the position of the block head will be the length 
		of the answer that was written.
		
	   Algorithm
		
		Let's maintain block, the start position of the contiguous group of characters we are currently indexing through.
		
		Now, let's read from left to right. We know that we must be at the end of the block when we are at the last character, 
		or when the next character is different from the current character.
		
		When we are at the end of a group, we will write the result of that group down using our add var. chars[block] will 
		be the correct character, and the length (if greater than 1) will be i - block + 1. We will write the digits of that 
		number to the array.
	 */
	
	
	
	public static void main(String[] args) {
		System.out.println(compress("alaasass".toCharArray()));
		System.out.println(compress("arranguttaaan".toCharArray()));
	}

	public static int compress(char[] chars) {
        int block = 0, add = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length || chars[i + 1] != chars[i]) {
                chars[add++] = chars[block];
                if (i > block) {
                    for (char c: ("" + (i - block + 1)).toCharArray()) {
                        chars[add++] = c;
                    }
                }
                block = i + 1;
            }
        }
        System.out.println(chars);
        return add; //length of compressed string
    }
}


class SBA4V2Problem2{
	public static LinkedHashMap<String, Integer> r = new LinkedHashMap<String, Integer>();

	public static void main(String[] args) {
		String [] strings = {"alex", "xylos", "alex", "alan", "alex", "alex", "xylos"};
		register(strings);
	}

	public static void register(String [] names) {
		for(String name : names) {
			//int num = 1;
			if (r.containsKey(name.substring(0, name.length()))) {
				r.put(name + r.get(name), r.get(name) + 1);
			} else {
				r.put(name, 1);
				//num = 1;
			}
	}
		
		for (Entry<String, Integer> x : r.entrySet()) {
			if (x.getValue() == 0) {
				System.out.println(x.getKey());
			} else {
				System.out.println(x.getKey());
			}
		}
	}
}


