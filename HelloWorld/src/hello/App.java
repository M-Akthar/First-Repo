package hello;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		String output = "Hello World!!";
		
		System.out.println(output);
		
		HelloWorld hw = new HelloWorld();
		
		hw.printMessage("Hello World!!!");
		
		String output2 = hw.returnString();
		
		System.out.println(output2);
		
		int a = 10;
		int b = 5;
		
		hw.add(a, b);
		hw.multiply(6, 6);
		hw.subtract(20, 8);
		hw.divide((double)a, 3);
		/* The brackets are converting the int a to a double data type.
		   This is known as casting */
		
		
		
	}
}
