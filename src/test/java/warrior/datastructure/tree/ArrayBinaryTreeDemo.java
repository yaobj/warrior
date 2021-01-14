package warrior.datastructure.tree;

/**
 * 
 * 顺序存储二叉树 
 * @author 姚斌杰
 * @date 2021年1月14日 下午11:01:48 
 * 
 *
 */
public class ArrayBinaryTreeDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
		arrayBinaryTree.preOrder(0);
	}
	
}

class ArrayBinaryTree{
	private int[]  arr;
	
	public ArrayBinaryTree(int[]  arr) {
		this.arr = arr;
	}
	
	
	/**
	 * 
	 * 顺序存储二叉树的前序遍历 
	 * @param index
	 * @author 姚斌杰 
	 * @date 2021年1月14日 下午11:05:43
	 */
	public void preOrder(int index) {
		
		if(arr == null || arr.length ==0) {
			System.out.println("数组为空~");
			return;
		}
		// 输出当前节点值
		System.out.println(arr[index]);
		
		// 向左递归输出
		if(2*index+1<arr.length) {
			preOrder(2*index+1);
		}
		
		// 向右递归
		if(2*index+2<arr.length) {
			preOrder(2*index+2);
		}
		
	}
	
	
}

