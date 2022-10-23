package leetcode.p2342;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.maximumSum(
				new int[] { 368, 369, 307, 304, 384, 138, 90, 279, 35, 396, 114,
						328, 251, 364, 300, 191, 438, 467, 183 }));

	}

	public int maximumSum(int[] nums) {
		int max = -1;
		Map<Integer, Integer> sumWithMax = new HashMap<>();
		for (int i : nums) {
			int sum = getSumDigits(i);
			if (sumWithMax.containsKey(sum)) {
				max = Math.max(max, sumWithMax.get(sum) + i);
				if (i > sumWithMax.get(sum)) {
					sumWithMax.put(sum, i);
				}
			} else {
				sumWithMax.put(sum, i);
			}
		}
		return max;
	}

	private int getSumDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return sum;
	}

}
