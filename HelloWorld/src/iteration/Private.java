package iteration;

import java.util.List;

public class Private {
	
	public int max(List<Integer> nums) {
		return extreme(nums, true);
	}

	public int min(List<Integer> nums) {
		return extreme(nums, false);
	}
	
	private int extreme(List<Integer> nums, boolean max) {
		int extreme = max ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		for (int i : nums) {
			extreme = max ? Math.max(extreme, i) : Math.min(extreme, i);
		}
		return extreme;
	}
}
