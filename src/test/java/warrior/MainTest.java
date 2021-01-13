package warrior;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {

		//		ArrayQuene arrayQuene = new ArrayQuene(10);
		//
		//		for (int i = 0; i < 11; i++) {
		//			arrayQuene.put(i + "");
		//			System.out.println(arrayQuene.toString());
		//		}
		//
		//		for (int i = 0; i < 5; i++) {
		//			arrayQuene.get();
		//			System.out.println(arrayQuene.toString());
		//		}
		//
		//		for (int i = 0; i < 11; i++) {
		//			arrayQuene.put(i + "");
		//			System.out.println(arrayQuene.toString());
		//		}
		//
		//		for (int i = 0; i < 11; i++) {
		//			arrayQuene.get();
		//			System.out.println(arrayQuene.toString());
		//		}
		//
		//		Stack<String> stack = new Stack<String>();
		//
		//		stack.add("a");
		//		stack.add("b");
		//		stack.add("c");
		//		System.out.println(stack.pop());
		//		System.out.println(stack.pop());
		//		System.out.println(stack.pop());
		int next = 0;
		int ss = 0;
		System.out.println(next = next++);
		System.out.println(next);
		System.out.println(++ss);
		System.out.println(ss);

	}

	class ArrayList {

		private Object[] list;

		private int next;

		public ArrayList(int capacity) {

			list = new Object[capacity];
		}

		public ArrayList() {

			list = new Object[16];
		}

		public void add(Object o) {

			if (next == list.length) {
				list = Arrays.copyOf(list, list.length * 2);
			}
			list[next++] = o;
		}

		public Object get(int index) {

			return list[index];
		}

		public int size() {

			return next;
		}

		//		public static void main(String[] args) {
		//
		//			ArrayList newlist = new ArrayList();
		//			newlist.add("adam");
		//			newlist.add("robin");
		//			System.out.println(newlist.get(0));
		//			System.out.println(newlist.size());
		//		}
	}

}

class Solution {

	public int waysToMakeFair(int[] nums) {

		int oSum = 0;
		int jSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				oSum = oSum + nums[i];
			} else {
				jSum = jSum + nums[i];
			}
		}

		int num = 0;
		int jSum1 = 0;
		int oSum1 = 0;

		int jSum2 = 0;
		int oSum2 = 0;
		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 0) {
				oSum1 = oSum1 + nums[i];
			} else {
				jSum1 = jSum1 + nums[i];
			}

			if (i % 2 == 0) {
				oSum2 = jSum - jSum1 - nums[i];
				jSum2 = oSum - oSum1;
			} else {
				oSum2 = jSum - jSum1;
				jSum2 = oSum - oSum1 - nums[i];
			}

			if (jSum1 + jSum2 == oSum1 + oSum2) {
				num++;
			}

		}

		return num;
	}
}
