package leetcode.p977;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
	public int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int l = 0, r = n - 1;
		for (int i = 0; i < n; i++) {
			if (Math.abs(nums[r]) > Math.abs(nums[l])) {
				result[i] = nums[r] * nums[r];
				r--;
			} else {
				result[i] = nums[l] * nums[l];
				l++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] result = s.sortedSquares(new int[] { -4, -1, 0, 3, 10 });
		System.out.println(
				Arrays.stream(result).boxed().collect(Collectors.toList()));
	}
}
