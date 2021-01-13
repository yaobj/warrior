package warrior.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * 冒泡排序
 * 
 * @author yaobj
 * @date Jan 13, 2021 10:21:47 AM
 * 
 *
 */
public class BubblingSort {

	public static void main(String[] args) {

		int[] nums = new int[] { 8, 4, 14, 5, 7, 1, 3, 6, 9, 2, 10, 11, 15, 13, 12 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void sort(int[] arrs) {

		int temp = 0;
		for (int i = 0; i < arrs.length - 1; i++) {

			for (int j = 0; j < arrs.length - 1 - i; j++) {

				if (arrs[j] > arrs[j + 1]) {
					temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}

			}

		}

	}
}
