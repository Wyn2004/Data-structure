import java.util.Arrays;
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

    public int[] intersection(int[] nums1, int[] nums2) {
		int m = 0, n = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		LinkedList<Integer> list = new LinkedList<>();
		while (m < nums1.length && n < nums2.length) {
			if (nums1[m] > nums2[n])
				n++;
			else if (nums1[m] < nums2[n])
				m++;
			else {
				if (!list.contains(nums1[m]))
					list.add(nums1[m]);
				System.out.println(list.toString());
				n++;
				m++;
			}
		}
		int result[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			result[i] = list.get(n);
		return result;
	}

	public static void main(String args[]) {
		String str = "acolkxjbizfmhnrdq";
	}
}
