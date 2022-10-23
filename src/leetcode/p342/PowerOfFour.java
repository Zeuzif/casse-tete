package leetcode.p342;

public class PowerOfFour {

	public static void main(String[] args) {
		PowerOfFour main = new PowerOfFour();
		System.out.println(main.isPowerOfFour(0));
	}

	public boolean isPowerOfFour(int n) {
		double x = Math.log(n) / Math.log(4);
		return Double.isFinite(x) && x == Math.floor(x);
	}
}
