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
		// capacity is 16 + initialized String's length
		System.out.println(sb3.capacity()); 
		// length - character count
		System.out.println(sb3.length());
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
		
		// index of the first occurrence of specified substring
		System.out.println(sb3.indexOf("l"));
		
		// similar but for the last occurrence
		System.out.println(sb3.lastIndexOf("l"));
		
		// inserting at specified offset >= 0 and <= length
		sb3.insert(4, "o World");
		System.out.println(sb3);
		
		// replacing from start (inclusive) to end (exclusive or end of string) indices
		sb3.replace(0, 5, "Cool");
		System.out.println(sb3);
		
		// replacing the character at the specified index
		sb3.setCharAt(5, 'w');
		System.out.println(sb3);
		
		// reverses the sequence
		System.out.println(sb3.reverse());
		
		// substring from start (inclusive) to end (exclusive or end of string)
		System.out.println(sb3.substring(5));
		System.out.println(sb3.substring(7, 8));
		
		// try to trim if storage is too big for the character sequence
		System.out.println(sb3.capacity());
		sb3.trimToSize();
		System.out.println(sb3.capacity()); // reduced to 10
	}
}
