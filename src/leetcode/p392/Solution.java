package leetcode.p392;

public class Solution {
	public boolean isSubsequence(String s, String t) {
		int p1 = 0, p2 = 0;
		while (p1 < s.length() && p2 < t.length()) {
			if (s.charAt(p1) == t.charAt(p2++)) {
				p1++;
			}
		}
		if (p1 == s.length())
			return true;
		return false;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isSubsequence("abc", "ahbgdc"));
	}
}
