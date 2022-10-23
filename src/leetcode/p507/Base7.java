package leetcode.p507;

public class Base7 {
	public String convertToBase7(int num) {
		int temp = num;
		StringBuilder result = new StringBuilder();
		if (temp < 0)
			temp = -temp;
		do {
			result.append(temp % 7);
			temp = temp / 7;
		} while (temp != 0);
		if (num < 0)
			result.append("-");
		return result.reverse().toString();
	}

	public static void main(String[] args) {
		Base7 base = new Base7();
		System.out.println(base.convertToBase7(0));
	}
}
