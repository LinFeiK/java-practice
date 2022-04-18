package java_practice;

public class GCFandLCM {

	public static void main(String[] args) {
		System.out.println(greatestCommonFactor(1000, 25));
		System.out.println(greatestCommonFactor(1071, 462));
	}
	
	// a >= b
	public static int greatestCommonFactor(int a, int b) {
        int remainder = 0;
        
        if (a == b) return a;
        if (a % b == 0) return b;
        
        for (int i = 0; (i * b) <= a; i++) {
            remainder = a - (i * b);
            System.out.println(remainder);
            
            if (remainder == 0) {
                return b;
            } else if (remainder < b) {
                return greatestCommonFactor(b, remainder);
            }
        }
        
        return 1;
    }

}
