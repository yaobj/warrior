package warrior.algorithm.search;

/**
 * 插值查找
 * 1.对于数据量比较大，关键值分布比较均匀的情况下，插值查比较好
 * 2.关键值分布不均匀时不一定比二分查找好
 * 
 * @author yaobj
 * @date Jan 13, 2021 5:35:01 PM
 * 
 *
 */
public class InterpolationSearch {

	public static void main(String[] args) {

		int[] arrs = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(search(arrs, 0, arrs.length - 1, 9));
	}

	public static int search(int[] arrs, int start, int end, int value) {

		System.out.println("start:" + start + "  end :" + end);
		if (start <= end) {

			//			int mid = (start + end) / 2;
			// 插值查找算法和二分查找算法的区别
			int mid = start + (end - start) * (value - arrs[start]) / (arrs[end] - arrs[start]);
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
