package java_practice;

// StringBuilder represents a mutable sequence of characters (vs Strings that are immutable)
// Unlike StringBuffer, StringBuilder has no synchronization guarantee, so use this when 
// 	working on a single thread
public class PracticeStringBuilder {
	public static void main(String[] args) {
		// empty builder with initial capacity of 16
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		
		// empty builder with initial capacity of argument
		StringBuilder sb2 = new StringBuilder(5);
		System.out.println(sb2.capacity());
		System.out.println(sb2);
		
		// initialized with the specified String or CharSequence
		StringBuilder sb3 = new StringBuilder("Hello");
		System.out.println(sb3.capacity());
		System.out.println(sb3);
		
		// appending to the sequence
		sb3.append(" World ");
		sb3.append(5);
		System.out.println(sb3);
		
		// character at specified index
		System.out.println(sb3.charAt(4));
		
		// deleting from startIndex (inclusive) to endIndex (not inclusive) 
		//	won't delete anything if startIndex == endIndex
		sb3.delete(5, 7);
		System.out.println(sb3);
		
		// if endIndex is too big, deletes to the end
		sb3.delete(5, 15);
		System.out.println(sb3);
		
		// deleting one character at index
		sb3.deleteCharAt(4);
		System.out.println(sb3);
	}
}
