package java_practice;

import java.util.HashMap;

public class PracticeHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> ages = new HashMap<String, Integer>();
		
		// key, value
		ages.put("Amy", 31);
		ages.put("Jake", 33);
		ages.put("Rosa", 32);
		
		for (String person : ages.keySet()) {
			System.out.println(person + " is " + ages.get(person) + " years old.");
		}

	}

}
