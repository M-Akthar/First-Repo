package hello;

public class HelloWorld {
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public String returnString() {
		return "Hello World!!!!";
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	public void subtract(int a, int b) {
		System.out.println(a - b);
	}
	
	public void divide(double a, double b) {
		if (a > b) {
			System.out.println(a / b);			
		} else {
			System.out.println("The division cannot be performed");
		}
	}

}
