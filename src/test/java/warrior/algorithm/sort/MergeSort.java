package warrior.algorithm.sort;

/**
 * 
 * 归并排序算法
 * （分治算法）
 * 
 * @author yaobj
 * @date Jan 4, 2021 9:11:07 AM
 * 
 *
 */
public class MergeSort {

	public static void main(String[] args) {

		//		int[] nums = new int[] {8,4,5,7,1,3,6,9,2,10,11,15,13,12};
		int[] temp = new int[10000000];

		int[] arr = new int[10000000];

		for (int i = 0; i < 10000000; i++) {
			arr[i] = (int) (Math.random() * 1000000000);
		}

		long start = System.currentTimeMillis();

		mergeSort(arr, 0, arr.length - 1, temp);

		long time = System.currentTimeMillis() - start;

		System.out.println("执行时间：" + time / 1000);

	}

	public static void mergeSort(int[] nums, int left, int right, int[] temp) {

		if (left < right) {
			int mid = (left + right) / 2;
			// 向左递归分解
			mergeSort(nums, left, mid, temp);

			// 向右递归分解
			mergeSort(nums, mid + 1, right, temp);

			// 合并
			merge(nums, left, mid, right, temp);
		}
	}

	// 合并
	public static void merge(int[] arr, int left, int mid, int right, int[] temp) {

		int i = left;
		int j = mid + 1;
		int t = 0;
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[t] = arr[i];
				i++;
			} else {
				temp[t] = arr[j];
				j++;
			}
			t++;
		}

		while (i <= mid) {
			temp[t] = arr[i];
			t++;
			i++;
		}

		while (j <= right) {
			temp[t] = arr[j];
			t++;
			j++;
		}

		t = 0;
		int tempLeft = left;
		while (tempLeft <= right) {
			arr[tempLeft] = temp[t];
			t++;
			tempLeft++;
		}
	}
}
