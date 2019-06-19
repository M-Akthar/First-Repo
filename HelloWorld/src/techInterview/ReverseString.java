package techInterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString myObj = new ReverseString();
		
		myObj.reverseString("Hello World");
			

	}
	
	public void reverseString(String input) {
		
		char[] stringToArray = input.toCharArray();
		
		char[] reversedString = new char[stringToArray.length];
		
		for( int i = 1; i < stringToArray.length + 1; i++) {
			reversedString[stringToArray.length - i] = stringToArray[i - 1];
		}
		
		System.out.println(stringToArray);
		System.out.println(reversedString);
		
		// Improvement is to convert the array back to a string and return it so that it is usable as a string.
		
	}

}
