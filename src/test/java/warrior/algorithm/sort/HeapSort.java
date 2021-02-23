package warrior.algorithm.sort;

public class HeapSort {

	public static void main(String[] args) {

//		int[] nums = new int[] {8,4,5,14,7,1,3,6,9,2,10,11,15,13,12};
//		sort(nums);
//		System.out.println(Arrays.toString(nums));
		

		int[] arr = new int[10000000];
		for (int i = 0; i < 10000000; i++) {
			arr[i] = (int) (Math.random() * 1000000000);
		}

		long start = System.currentTimeMillis();

		sort(arr);

		long time = System.currentTimeMillis() - start;
		System.out.println("执行时间：" + time / 1000);
	}
	
	
	public static void sort(int[] arr) {
		System.out.println("堆排序开始~");
		
		for(int i = arr.length/2-1;i>=0;i--) {
			adjustHeap(arr, i, arr.length);
		}
		
		int temp = 0;
		for(int j = arr.length-1;j>0;j--) {
			
			
//			for(int i = (j+1)/2-1;i>=0;i--) {
//				adjustHeap(arr, i, j);
//			}
			
			temp = arr[j];
			arr[j] = arr[0];
			arr[0] = temp;
			adjustHeap(arr, 0, j);
			
		}
	}
	
	/**
	 * 
	 * 调整堆
	 * @param arr
	 * @param i 非叶子节点在数组中的索引
	 * @param lenght
	 * @author 姚斌杰 
	 * @date 2021年1月16日 下午5:14:23
	 */
	public static void adjustHeap(int[] arr,int i,int lenght) {
		
		int temp = arr[i];
		
		for(int k = 2*i+1;k<lenght; k=2*k+1) {
			
			// 说明左子节点的值小于右字节点的值
			if(k+1<lenght && arr[k]<arr[k+1]) {
				k++;// k指向右子节点
			}
			
			if(arr[k] >temp) {
				arr[i] = arr[k];				
				i = k;
			} else {
				break;
			}
		}
		
		arr[i] = temp;
	}
}

