package conditionals;

public class ConditionalMethods {

	public int myMethod(int a, int b, boolean c) {
		
		if (a % 2 == 0 || b % 2 == 0) {
			return 0;
		}
		
		if(c) {
			return a + b;
		} else {
			return a * b;
		}
		
	}
	
}
