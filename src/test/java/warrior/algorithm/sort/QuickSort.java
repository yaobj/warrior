package warrior.algorithm.sort;

/**
 * 
 * 快速排序
 * 
 * @author yaobj
 * @date Jan 3, 2021 6:30:58 PM
 * 
 *
 */
public class QuickSort {

	public static void main(String[] args) {

		//		int[] arr = new int[] { 4, 1, 5, 6, 2, 3, 9, 8, 7, 0 };

		int[] arr = new int[10000000];

		for (int i = 0; i < 10000000; i++) {
			arr[i] = (int) (Math.random() * 1000000000);
		}

		long start = System.currentTimeMillis();

		sort(arr, 0, arr.length - 1);

		long time = System.currentTimeMillis() - start;

		System.out.println("执行时间：" + time / 1000);

		//		sort(arr, 0, arr.length - 1);

	}

	public static void sort(int arr[], int left, int right) {

		int l = left;
		int r = right;

		int pivotIndex = (l + r) / 2;
		int pivotVal = arr[pivotIndex];
		int temp = 0;
		while (l < r) {
			while (arr[l] < pivotVal) {
				l++;
			}

			while (arr[r] > pivotVal) {
				r--;
			}
			if (l >= r) {
				break;
			}

			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;

			// 这个判断说明右边先到达中点
			if (arr[r] == pivotVal) {
				r--;
			}
			// 说明左边先到达中点
			if (arr[l] == pivotVal) {
				left++;
			}

		}

		// ?
		if (l == r) {
			l++;
			r--;
		}
		//		System.out.println(Arrays.toString(arr));
		// 向左递归
		if (left < r) {
			sort(arr, left, r);
		}
		if (right > l) {
			sort(arr, l, right);
		}

	}

}
