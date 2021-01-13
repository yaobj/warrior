package warrior.algorithm.search;

/**
 * 线性查找
 * 
 * @author yaobj
 * @date Jan 13, 2021 3:25:35 PM
 * 
 *
 */
public class SequenceSearch {

	public static void main(String[] args) {

	}

	public static int search(int[] arrs, int value) {

		for (int i = 0; i < arrs.length; i++) {
			if (arrs[i] == value) {
				return i;
			}
		}

		return -1;

	}

}
