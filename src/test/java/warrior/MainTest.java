package warrior;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		if(nums == null || nums.length<2) {
			return null;
		}
		
		for(int i= 0 ;i<nums.length ;i++) {
			int key= target-nums[i];
			if(map.containsKey(key)) {
				return new int[] {map.get(key),i};
			}
			
			map.put(nums[i], i);
		}
		
		return nums;

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
