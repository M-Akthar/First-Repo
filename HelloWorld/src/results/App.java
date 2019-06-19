package results;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResultMethods rm = new ResultMethods();
		
		float physicsMark = 128;
		float chemistryMark = 117;
		float biologyMark = 110;
		float totalMark = physicsMark + chemistryMark + biologyMark;
		
		float physicsPerc = (physicsMark/150) * 100;
		float chemistryPerc = (chemistryMark/150) * 100;
		float biologyPerc = (biologyMark/150) * 100;
		
		rm.displayMarks(physicsMark, chemistryMark, biologyMark, totalMark);
		
		float totalPercentage = rm.calcPercentage(totalMark);
		
//		if (totalPercentage < 60) {
//			System.out.println("You have failed!");
//		} else {
//			System.out.println("Well done! You have passed.");
//		}
		
		int numberOfFails = 0;
		
		if (physicsPerc < 60) {
			numberOfFails++;
		}
		if (chemistryPerc < 60) {
			numberOfFails++;
		}
		if (biologyPerc < 60) {
			numberOfFails++;
		}
		
		boolean failed = false;
		
		if (physicsPerc < 60) {
			failed = true;
		} else if (chemistryPerc < 60) {
			failed = true;
		} else if (biologyPerc < 60) {
			failed = true;
		} else if (totalPercentage < 60) {
			failed = true;
		} else {
			System.out.println("Well done! You have passed.");
		}
		
		if (failed == true && numberOfFails > 1) {
			System.out.println("You have failed " + numberOfFails + " subjects.");
		} else if (failed == true && numberOfFails == 1) {
			System.out.println("You have failed a subject.");
		}
		
		
//		switch(60) {
//			case physicsPerc < 60:
//				System.out.println("You have failed!");
//				break;
//			case chemistryPerc <60:
//				System.out.println("You have failed!");
//				break;
//			case biologyPerc <60:
//				System.out.println("You have failed!");
//				break;
//			case totalPercentage <60:
//				System.out.println("You have failed!");
//				break;
//			default:
//		}
				
		
	}

}
