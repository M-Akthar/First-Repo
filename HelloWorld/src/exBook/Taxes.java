package exBook;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxes taxes = new Taxes();
		
		float salary = 48500;
		
		System.out.println("Salary: " + salary);
		System.out.println("Amount taxed: " + taxes.calculateTax(salary));

	}
	
	private int calcPercentile(int a) {
		if (a >= 0 && a <= 14999) {
				return 0;
		}	else if (a >= 15000 && a <= 19999) {
				return 10;
		}	else if (a >= 20000 && a <= 29999) {
				return 15;
		}	else if (a >= 30000 && a <= 44999) {
				return 20;
		}	else if (a >= 45000) {
				return 25;
		}	else {
				return 0;
		}
	}
	
	public float calculateTax (float salary) {
		// I did some casting and left it in for learning purposes. 
		float percMultiplier = ((float)calcPercentile((int)salary))/100;
		
		return salary * percMultiplier;
		
	}
	

}
