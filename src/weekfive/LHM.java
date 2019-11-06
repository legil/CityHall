package weekfive;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LHM {
	public static void main(String[] args) {
		LinkedHashMap <String, Integer>map = new LinkedHashMap<String, Integer>(16, .75f, true); // (16, .75f, true - accessorder = true //changed from linkedhashmap to treemap
		//if TreeMap<Student, Integer> then you need to write a Comparator to sort //switch back and forth to TreeMap
		
		map.put("Max",  25);
		map.put("Lucy",  35);
		map.put("Daniel",  45);
		map.put("Tommy",  55);
		map.put("Peter",  65);
		map.put("Mercy",  25);
		
		//printMap(map);
		
		map.get("Mercy");
		map.get("Max");
		//System.out.println(map.get("Tommy")); //moved daniel to end bc acess order - lru = least recenty used
		//System.out.println(map.get("Lucy"));
		
		printMap(map);
	}
	
	public static void printMap(LinkedHashMap<String, Integer> map) {
		/*map.forEach((x, y) -> {
			System.out.println(x + ": " + y);
		});
		*/
		
		for(Entry<String, Integer> x: map.entrySet()) {
			System.out.println("Key: " + x.getKey() + ", Value: " + x.getValue());
		}
	}

}
