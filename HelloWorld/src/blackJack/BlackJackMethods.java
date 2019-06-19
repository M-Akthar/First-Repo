package blackJack;

public class BlackJackMethods {

	public int blackJack(int a, int b) {
		
		int checkA = 21 - a;
		int checkB = 21 - b;
		// A smaller positive difference is closer to 21.
		
		if (a >= 0 && b >=0) {
			
			if (checkA > -1 && checkA < checkB) {
				System.out.println(a);
				return a;
			} else if (checkB > -1 && checkB < checkA) {
				System.out.println(b);
				return b;
			} else if (checkA < 0 && checkB >= 0) {
				System.out.println(b);
				return b;
			} else if(checkB < 0 && checkA >= 0) {
				System.out.println(a);
				return a;
			} else if (checkA == checkB){
				System.out.println(a);
				return a;
			} else {
				System.out.println(0);
				return 0;
			}
			
		} else {
			System.out.println("Please try again with positive numbers");
			return 0;
		}
		
	}
	
}
