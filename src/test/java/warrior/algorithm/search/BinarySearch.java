package warrior.algorithm.search;

/**
 * 
 * 二分查找
 * 
 * @author yaobj
 * @date Jan 13, 2021 3:58:50 PM
 * 
 *
 */
public class BinarySearch {

	public static void main(String[] args) {

		int[] arrs = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(search(arrs, 0, arrs.length - 1, 1));
	}

	public static int search(int[] arrs, int start, int end, int value) {

		System.out.println("start:" + start + "  end :" + end);
		if (start <= end) {

			int mid = (start + end) / 2;
			if (value == arrs[mid]) {
				System.out.println("find:" + mid);
				return mid;
			} else if (value > arrs[mid]) {
				mid++;
				return search(arrs, mid, end, value);
			} else {
				mid--;
				return search(arrs, start, mid, value);
			}
		}

		return -1;

	}

}
