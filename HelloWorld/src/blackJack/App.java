package blackJack;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlackJackMethods bm = new BlackJackMethods();
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter a positve number");
		int num1 = myObj.nextInt();
		
		System.out.println("Please enter another positve number");
		int num2 = myObj.nextInt();
		
		myObj.close();
		
		bm.blackJack(num1, num2);
		
	}

}
