import java.security.Identity;
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

	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		TreeNode node = null;
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.right != null)
				queue.add(node.right);
			if (node.left != null)
				queue.add(node.left);
		}
		return node.val;
	}

	public static void main(String args[]) {
		String str = "acolkxjbizfmhnrdq";
	}
}
