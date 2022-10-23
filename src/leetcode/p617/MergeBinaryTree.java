package leetcode.p617;

import java.util.LinkedList;

public class MergeBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(0);
		root.left = new Node(1);
		root.right = new Node(3);
		root.right.left = new Node(2);
		Node.traversePreorder(root);
		System.out
				.println("--------------------------------------------------");
		Node.travese(root);
	}

}

class Node {
	int val;
	Node left;
	Node right;

	public Node(int val) {
		this.val = val;
	}

	public static void visit(Node node) {
		System.out.println(node.val);
	}

	public static void traversePreorder(Node node) {
		if (node != null) {
			visit(node);
			traversePreorder(node.left);
			traversePreorder(node.right);
		}
	}

	public static void travese(Node node) {
		LinkedList<Node> stack = new LinkedList<>();
		Node current = node;
		stack.push(current);
		while (!stack.isEmpty()) {
			current = stack.pop();
			visit(current);
			if (current.right != null) {
				stack.push(current.right);
			}
			if (current.left != null) {
				stack.push(current.left);
			}
		}
	}

	public static Node fromArray(int[] array) {
		if (array.length == 0)
			return null;
		Node root = new Node(array[0]);
		for (int i = 0; i < array.length; i++) {

		}
		return root;
	}
}
