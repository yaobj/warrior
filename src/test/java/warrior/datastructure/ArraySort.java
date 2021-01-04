package warrior.datastructure;

public class ArraySort {

	public static void main(String[] args) {

		int[] ff = new int[] { 4, 1, 5, 6, 2, 3, 9, 8, 7 };

		for (int i = 0; i < 9 - 1; i++) {

			int min = ff[i];
			int index = i;

			for (int j = i; j < 9; j++) {

				if (min > ff[j]) {
					min = ff[j];
					index = j;
				}

			}

			ff[index] = ff[i];
			ff[i] = min;

		}

		for (int i : ff) {

			System.out.println(i);
		}

	}

	public static void sort() {

		int[] ff = new int[] { 4, 1, 5, 6, 2, 3, 9, 8, 7 };
		int[] result = new int[ff.length];
		result[0] = ff[0];

		for (int i = 0; i < 9 - 1; i++) {
			int a = ff[i + 1];

			for (int j = 0; j < i + 1; j++) {

			}

		}

		for (int i : ff) {

			System.out.println(i);
		}
	}

}
