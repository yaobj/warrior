package warrior.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * 插入排序
 * 
 * @author yaobj
 * @date Jan 13, 2021 10:14:39 AM
 * 
 *
 */
public class InsertSort {

	public static void main(String[] args) {

		int[] arrs = new int[] { 2, 6, 1, 3, 7, 4, 9, 8, 5 };

		sort(arrs);
		System.out.println(Arrays.toString(arrs));

	}

	public static void sort(int[] arrs) {

		for (int i = 1; i < arrs.length; i++) {

			int insertVal = arrs[i];
			int insertIndex = i;
			int j = i - 1;
			while (j >= 0) {

				if (insertVal < arrs[j]) {
					arrs[j + 1] = arrs[j];
					insertIndex = j;
				} else {
					break;
				}
				j--;

			}

			arrs[insertIndex] = insertVal;

		}

	}
}
