package java_practice;

// practicing the Greatest Common Factor (Euclidean Algorithm found on https://en.wikipedia.org/wiki/Euclidean_algorithm)
// 	and Least Common Multiple algorithms
public class GCFandLCM {

	public static void main(String[] args) {
		System.out.println(greatestCommonFactor(1000, 25));
		System.out.println(greatestCommonFactor(1071, 462));
		System.out.println(leastCommonMultiple(25, 75));
		System.out.println(leastCommonMultiple(30, 40));
	}
	
	// a >= b
	public static int greatestCommonFactor(int a, int b) {
        int remainder = 0;
        
        if (a == b) return a;
        if (a % b == 0) return b;
        
        for (int i = 0; (i * b) <= a; i++) {
            remainder = a - (i * b);
            
            if (remainder == 0) {
                return b;
            } else if (remainder < b) {
                return greatestCommonFactor(b, remainder);
            }
        }
        
        return 1;
    }
	
	public static int leastCommonMultiple(int a, int b) {
		if (a % b == 0) return a;
		if (b % a == 0) return b;
		return a / greatestCommonFactor(a, b) * b;
	}

}
