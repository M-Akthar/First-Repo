package appendixA;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlowchartAMethods fam = new FlowchartAMethods();
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter a value");
		
		int a = myObj.nextInt();
		myObj.close();
		
		fam.flowChartA(a);
		
	}

}
