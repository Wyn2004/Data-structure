import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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

	public void toArray(ListNode head) {

	}

	public ListNode removeZeroSumSublists(ListNode head) {
		ListNode temp = head;
		List<Integer> list = new ArrayList<>();
		while (temp != null) {
			list.add(temp.val);
			temp = temp.next;
		}
		int i = 0;
		while (i < list.size() - 1) {
			int sum = list.get(i);
			if (sum == 0) {
				list.remove(i);
				continue;
			}
			int j = i + 1;
			while (j < list.size()) {
				sum += list.get(j);
				if (sum == 0) {
					for (int k = i; k <= j - i; k++)
						list.remove(k);
					if (i != 0)
						i--;
					break;
				}
				j++;
			}
			System.out.println(i);
			i++;
		}
		if (list.size() == 1 && list.get(0) == 0)
			return null;
		ListNode newHead = new ListNode(0);
		temp = newHead;
		for (int integer : list) {
			if (integer == 0)
				continue;
			temp.next = new ListNode(integer);
			temp = temp.next;
		}
		return newHead.next;
	}

	public static void main(String args[]) {
		String str = "acolkxjbizfmhnrdq";
	}
}
