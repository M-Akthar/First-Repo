package iteration;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public int squareEvenMin(List<Integer> nums) {
//		return nums.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce((a, b) -> Math.min(a, b)).get();
		return nums.stream().map(i -> i * i).filter(i -> i % 2 == 0).reduce(Math::min).get();
	}

	public int max(List<Integer> nums) {
//		return nums.stream().reduce((a, b) -> Math.max(a, b)).get();
		return nums.stream().reduce(Math::max).get();
	}

	public int min(List<Integer> nums) {
//		return nums.stream().reduce((a, b) -> Math.min(a, b)).get();
		return nums.stream().reduce(Math::min).get();
	}

	public int sum(List<Integer> nums) {
		return nums.stream().reduce((a, b) -> a + b).get();
	}

	public List<Integer> evens(List<Integer> nums) {
		return nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	public List<Integer> odds(List<Integer> nums) {
		return nums.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
	}
}