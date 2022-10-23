package leetcode.p1413;

public class Solution {
	public int minStartValue(int[] nums) {
		int startValue = 1;
		while (true) {
			int sum = startValue;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
				if (sum < 1) {
					startValue++;
					break;
				}
				if (i == nums.length - 1)
					return startValue;
			}
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.minStartValue(new int[] { -3, 2, -3, 4, 2 }));
	}
}
