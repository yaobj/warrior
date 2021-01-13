package warrior.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * 选择排序
 * 
 * @param args
 * @author yaobj
 * @date Jan 13, 2021 10:15:09 AM
 */
public class SelectSort {

	public static void main(String[] args) {

		int[] nums = new int[] { 8, 4, 14, 5, 7, 1, 3, 6, 9, 2, 10, 11, 15, 13, 12 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void sort(int[] arrs) {

		int minVal = 0;
		int minIndex = 0;
		// 缩短数组
		for (int i = 0; i < arrs.length; i++) {

			minVal = arrs[i];
			minIndex = i;
			// 从缩短后的数据中选择最小的数
			for (int j = i; j < arrs.length; j++) {
				if (minVal > arrs[j]) {
					minIndex = j;
					minVal = arrs[j];
				}
			}
			// 将选出的最小数放在这个数组的第一个位置
			arrs[minIndex] = arrs[i];
			arrs[i] = minVal;

		}

	}

}
