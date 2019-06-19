package iteration;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Loops loops = new Loops();

		System.out.println("Max: " + loops.max(nums));
		System.out.println("Min: " + loops.min(nums));
		System.out.println("Evens: " + loops.evens(nums));
		System.out.println("Odds: " + loops.odds(nums));
		System.out.println("Square-even-min: " + loops.squareEvenMin(nums));

		Streams streams = new Streams();
		System.out.println("Max: " + streams.max(nums));
		System.out.println("Min: " + streams.min(nums));
		System.out.println("Evens: " + streams.evens(nums));
		System.out.println("Odds: " + streams.odds(nums));
		System.out.println("Square-even-min: " + streams.squareEvenMin(nums));
	}

}