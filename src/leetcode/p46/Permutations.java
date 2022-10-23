package leetcode.p46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public static void main(String[] args) {
		Permutations permutations = new Permutations();
		// permutations.generate(3, new int[] { 1, 2, 3 });

		List<List<Integer>> result = new ArrayList<>();
		permutations.generateRecursively(result, new Integer[] { 1, 2, 3 }, 3);
		System.out.println(result);
	}

	private void generateRecursively(List<List<Integer>> result,
			Integer[] array, int k) {
		if (k == 1) {
			result.add(Arrays.asList(array));
		}
		for (int i = 0; i < k; i++) {
			generateRecursively(result, array, k - 1);
			swap(array, i, k - 1);
		}
	}

	private void swap(Integer[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	@SuppressWarnings("unused")
	private void print(int[] array) {
		StringBuilder str = new StringBuilder();
		str.append("{");
		for (int i = 0; i < array.length - 1; i++) {
			str.append(array[i]);
			str.append(", ");
		}
		str.append(array[array.length - 1]);
		str.append("}");
		System.out.println(str.toString());
	}

}
