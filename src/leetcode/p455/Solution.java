package leetcode.p455;

public class Solution {
	public int findContentChildren(int[] g, int[] s) {
		boolean[] consumedCookie = new boolean[g.length];
		int contentChildren = 0;
		for (int greed : g) {
			int minPos = -1;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < s.length; i++) {
				int actualDiff = s[i] - greed;
				if (actualDiff >= 0 && actualDiff < min) {
					minPos = i;
					min = s[i] - greed;
				}
			}
			if (minPos >= 0 && !consumedCookie[minPos]) {
				consumedCookie[minPos] = true;
				contentChildren++;
			}
		}
		return contentChildren;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.findContentChildren(new int[] { 1, 2, 3 },
				new int[] { 1, 5, 3 }));
	}
}
