package leetcode.p88;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1, p2 = n - 1, i = nums1.length - 1;
		while (p2 >= 0) {
			if (p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[i--] = nums1[p1--];
			} else {
				nums1[i--] = nums2[p2--];
			}
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] array1 = new int[] { 1, 2, 3, 0, 0, 0 },
				array2 = new int[] { 2, 5, 6 };
		sol.merge(array1, array1.length - array2.length, array2, array2.length);
		System.out.println(
				Arrays.stream(array1).boxed().collect(Collectors.toList()));
	}
}
