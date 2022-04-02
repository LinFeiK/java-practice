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
		System.out.println("sb3 = " + sb3);
	}
}
