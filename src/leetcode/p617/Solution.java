package leetcode.p617;

import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		StringBuilder to = new StringBuilder();
		to.append("[");
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(this);
		while (!stack.isEmpty()) {
			TreeNode current = stack.pop();
			to.append(current.val + ", ");
			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
		}
		to.replace(to.length() - 2, to.length(), "]");
		return to.toString();
	}
}

public class Solution {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(0, new TreeNode(1), new TreeNode(2));
		TreeNode root2 = new TreeNode(0, new TreeNode(1), new TreeNode(2));
		TreeNode root = Solution.mergeTrees(root1, root2);
		System.out.println(root);
	}

	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null)
			return root2;
		if (root2 == null)
			return root1;
		LinkedList<TreeNode[]> stack = new LinkedList<>();
		stack.push(new TreeNode[] { root1, root2 });
		while (!stack.isEmpty()) {
			TreeNode[] current = stack.pop();
			if (current[0] == null || current[1] == null)
				continue;
			current[0].val += current[1].val;
			if (current[0].left != null) {
				stack.push(new TreeNode[] { current[0].left, current[1].left });
			} else {
				current[0].left = current[1].left;
			}

			if (current[0].right != null) {
				stack.push(
						new TreeNode[] { current[0].right, current[1].right });
			} else {
				current[0].right = current[1].right;
			}
		}
		return root1;
	}

}
