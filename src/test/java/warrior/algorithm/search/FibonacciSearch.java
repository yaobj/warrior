package warrior.algorithm.search;

import java.util.Arrays;

public class FibonacciSearch {
	
	public static void main(String[] args) {

		int[] arrs = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(fibSearch(arrs, 4));
	}
	

	public static int maxSize = 20; 
	

	
	// 获得一个斐波那契数列
	public static int[] getFibArray() {
		
		int[] fib = new int[maxSize];
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2;i<maxSize ;i++) {
			fib[i] = fib[i-1] +fib[i-2];
		}
		return fib;
	}
	
	
	
	
	public static int fibSearch(int[] arrs,int key) {
		int low = 0;
		int hight = arrs.length-1;
		int k = 0;// 斐波那契数列的分隔下标
		int mid = 0;
		
		int[] fib = getFibArray();
		
		// 获取第一个值超过数组长度的斐波那契值
		while(hight>fib[k] - 1) {
			k++;
		}
		
		// 用数组最后一个元素将数组长度补全至获得的斐波那契值
		int[] temp = Arrays.copyOf(arrs, fib[k]);
		for(int i = hight+1;i<temp.length;i++) {
			temp[i] = arrs[hight];
		}
		
		// 长度为fib[k]的temp数组由两个长度为fib[K-1]和fib[k-2]的数组组成
		while(low<=hight) {
			// 获取mid的值为长度是fib[K-1]的数组的最后一个值的索引。
			mid = low+fib[k-1]-1;
			if(key<temp[mid]) {// 表示要查找的值在长度为fib[K-1]的数组中
				hight = mid;
				k= k-1;
			} else if(key>temp[mid]) {// 表示要查找的值在长度为fib[k-2]的数组中
				low = mid+1;
				
				// 剩余要查找的数
				k = k-2;
			} else {
				
				// 由于temp是补长的数据，查找到的数据可能是用最后一个元素补偿的数据，也就是原数组的最后一个元素
				// 所以要取以下最小值
				if(mid<=hight) {
					return mid;
				} else {
					return hight;
				}
			}
			
		}
		return -1;
		
	}
	
}

