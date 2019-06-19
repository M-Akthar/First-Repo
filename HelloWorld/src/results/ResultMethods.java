package results;

public class ResultMethods {
	
	public void displayMarks(float physics, float chemistry, float biology, float total) {
		System.out.println("Physics Mark: " + physics);
		System.out.println("Chemistry Mark: " + chemistry);
		System.out.println("Biology Mark: " + biology);
		System.out.println("Total Mark: " + total);
		
	}
	
	public float calcPercentage(float total) {
		float perc = (total * 100)/ 450;
		System.out.println(perc);
		return perc;
	}

}
