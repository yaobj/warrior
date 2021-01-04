package warrior.algorithm.sort;

/**
 * 
 * 希尔排序算法
 * 
 * @author yaobj
 * @date Jan 3, 2021 11:48:40 AM
 * 
 *
 */
public class ShellSort {

	public static void main(String[] args) {

		int[] arr = new int[100000];

		for (int i = 0; i < 100000; i++) {
			arr[i] = (int) (Math.random() * 10000000);
		}

		long start = System.currentTimeMillis();

		sort1(arr);

		long time = System.currentTimeMillis() - start;

		System.out.println("执行时间：" + time / 1000);

	}

	// 交换法
	public static void sort1(int[] arr) {

		//		int[] arr = new int[] { 4, 1, 5, 6, 2, 3, 9, 8, 7, 0 };

		int step = arr.length / 2;
		int temp = 0;
		while (step >= 1) {

			for (int i = step; i < arr.length; i++) {

				for (int j = i - step; j >= 0; j = j - step) {

					if (arr[j] > arr[j + step]) {
						temp = arr[j];
						arr[j] = arr[j + step];
						arr[j + step] = temp;
					}

				}
			}

			step = step / 2;

		}

		//		System.out.println(Arrays.toString(arr));
	}

	// 插入法
	public static void sort2(int[] arr) {

		//		int[] arr = new int[] { 4, 1, 5, 6, 2, 3, 9, 8, 7, 0 };

		int step = arr.length / 2;

		while (step >= 1) {

			for (int i = step; i < arr.length; i++) {

				int insertVal = arr[i];
				int insertIndex = i;
				int j = i - step;
				while (j >= 0) {

					if (insertVal < arr[j]) {
						arr[j + step] = arr[j];
						insertIndex = j;
					} else {
						break;
					}

					j = j - step;

				}

				arr[insertIndex] = insertVal;

			}

			step = step / 2;

		}

		//		System.out.println(Arrays.toString(arr));
	}

}
