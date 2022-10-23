package leetcode.p492;

public class Solution {
	public int[] constructRectangle(int area) {
		int[] result = new int[] { 0, 0 };
		int diff = Integer.MAX_VALUE;
		for (int w = 1; w * w <= area; w++) {
			for (int l = area / w; l >= w; l--) {
				int currentDiff = l - w;
				if (l * w == area && currentDiff < diff) {
					result[0] = l;
					result[1] = w;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] x = s.constructRectangle(37);
		System.out.println(x[0] + " " + x[1]);
	}
}
