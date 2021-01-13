package warrior.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * 基数排序（桶排序）
 * 以空间换时间
 * 
 * @author yaobj
 * @date Jan 13, 2021 11:01:23 AM
 * 
 *
 */
public class RadixSort {

	public static void main(String[] args) {

		int[] nums = new int[] { 8, 4, 5, 7, 1, 3, 6, 9, 2, 99, 10, 11, 15, 13, 12 };

		sort(nums);
		System.out.println(Arrays.toString(nums));

		//		int[] arr = new int[10000000];
		//
		//		for (int i = 0; i < arr.length; i++) {
		//			arr[i] = (int) (Math.random() * 100000000);
		//		}
		//
		//		long start = System.currentTimeMillis();
		//
		//		sort(arr);
		//
		//		long time = System.currentTimeMillis() - start;
		//
		//		System.out.println("执行时间：" + time / 1000);

	}

	public static void sort(int[] arrs) {

		// 初始化桶
		int[][] bucket = new int[10][arrs.length];

		int[] point = new int[10];

		boolean needDo = true;
		long radix = 1;
		while (needDo) {
			int temp = 0;
			for (int i = 0; i < arrs.length; i++) {
				// 获取这个数放在X号桶里
				int x = (int) ((arrs[i] / radix) % 10);
				temp = temp + x;
				bucket[x][point[x]++] = arrs[i];
			}
			needDo = temp > 0;
			temp = 0;
			// 基数增长
			radix = radix * 10;

			// 拷贝数据到原数组
			int t = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < point[i]; j++) {
					arrs[t++] = bucket[i][j];
				}
				point[i] = 0;
			}

		}

	}
}
