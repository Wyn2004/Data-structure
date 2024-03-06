import java.util.LinkedList;
import java.util.Queue;

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
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class test {

	public boolean isEvenOddTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean even = true;
		while (!queue.isEmpty()) {
			int size = queue.size();
			int prev = even ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (even && (node.val % 2 == 0 || node.val < prev))
					return false;
				if (!even && (node.val % 2 != 0 || node.val > prev))
					return false;
				prev = node.val;
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			even = !even;
		}
		return true;
	}

	public static void main(String args[]) {
		String str = "acolkxjbizfmhnrdq";
	}
}
