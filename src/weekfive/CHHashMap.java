package weekfive;


import java.util.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class CHHashMap {
	public static void main(String [] args) {
		HashMap<String, Integer> grades = new HashMap<String, Integer>();
		
		grades.put("Max",  91);
		grades.put("Ruby",  89);
		grades.put("Tommy", 87);
		
		//grades.put(null, 87);
		//grades.put(null, null);
		
		
		System.out.println(grades); //does not maintain insertion order
		System.out.println(grades.containsKey("Max"));
		System.out.println(grades.containsValue("87"));
		System.out.println(grades.get("Tommy"));
		System.out.println(grades.remove("Max", 92)); //removes a specific pair IF it exists
		System.out.println(grades.remove("Max", 91));
		
		System.out.println(grades);
		
		for(Entry<String, Integer> x : grades.entrySet()) {
			System.out.print(x.getKey() + ": ");
			System.out.println(x.getValue());
		}
		
		
		System.out.println(grades.hashCode());
		grades.clear();
		System.out.println(grades);
		
		
		
			//int[] test = {1,2,4};
			//System.out.println(Arrays.toString(test)); prints w square brackets, not curly braces
		
		
		
	}
}
