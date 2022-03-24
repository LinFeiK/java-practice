package java_practice;

import java.util.HashMap;

public class PracticeHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> ages = new HashMap<String, Integer>();
		
		// putting an item with key, value
		ages.put("Amy", 31);
		ages.put("Jake", 33);
		ages.put("Jake", 25); // keys are unique, this overrides the previous value
		ages.put("Rosa", 32);
		
		// size
		System.out.println(ages.size()); // 3
		
		// searching for existence
		System.out.println(ages.containsKey("Amy"));
		System.out.println(ages.containsValue(32));
		
		for (String person : ages.keySet()) {
			// accessing an item
			System.out.println(person + " is " + ages.get(person) + " years old.");
		}
		
		// accessing an item with default value
		System.out.println(ages.getOrDefault("Charles", -1));
		
		// values
		System.out.println(ages.values());
		
		// removing
		ages.remove("Jake");
		System.out.println(ages);
		
		// removing all
		ages.clear();
		System.out.println(ages);
	}

}
