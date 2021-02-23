package warrior;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);

	}

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (nums == null || nums.length < 2) {
			return null;
		}

		for (int i = 0; i < nums.length; i++) {
			int key = target - nums[i];
			if (map.containsKey(key)) {
				return new int[] { map.get(key), i };
			}

			map.put(nums[i], i);
		}

		return nums;

	}

	public class ListNode {

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

	class Solution {

		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

			int a = getIntVal(l1);

			int b = getIntVal(l2);

			int num = a + b;
			ListNode listNode = null;
			char[] str = String.valueOf(num).toCharArray();
			for (int i = str.length - 1; i > 0; i--) {

				if (i == str.length - 1) {
					listNode = new ListNode(Integer.parseInt(String.valueOf(str[i])));
				} else {
					listNode.next = new ListNode(Integer.parseInt(String.valueOf(str[i])));
				}
			}

			return listNode;

		}

		public int getIntVal(ListNode l) {

			int i = 1;
			int val = 0;
			while (l != null) {
				val = val + l.val * i;
				i = i * 10;
			}

			return val;

		}
	}

}
