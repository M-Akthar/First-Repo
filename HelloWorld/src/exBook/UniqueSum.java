package exBook;

public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniqueSum us = new UniqueSum();
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("Unique sum: " + us.uniqueSum(a, b, c));

	}
	
	public int uniqueSum(int a, int b, int c) {
		int sum = 0;
		
		if (a != b && a != c) {
			sum += a;
		}
		
		if (b != a && b !=c) {
			sum += b;
		}
		
		if (c != a && c != b) {
			sum += c;
		}
		
		return sum;
	}

}
