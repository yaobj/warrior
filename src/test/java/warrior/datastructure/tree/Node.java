package warrior.datastructure.tree;

public class Node<T> {
	 

	public Node(T data) {

		this.data = data;
	}

	private T data;

	/**
	 * 左节点
	 */
	private Node<T> left;
	/**
	 * 0 left指向左子树
	 * 1 left指向前驱节点
	 */
	private int leftType = 0;

	/**
	 * 右节点
	 */
	private Node<T> right;
	/**
	 * 0 right指向右子树
	 * 1 right指向后继节点	
	 */
	private int rightType = 0;
	
	

	
	public int getLeftType() {
	
		return leftType;
	}

	
	public void setLeftType(int leftType) {
	
		this.leftType = leftType;
	}

	
	public int getRightType() {
	
		return rightType;
	}

	
	public void setRightType(int rightType) {
	
		this.rightType = rightType;
	}

	public T getData() {

		return data;
	}

	public void setData(T data) {

		this.data = data;
	}

	public Node<T> getLeft() {

		return left;
	}

	public void setLeft(Node<T> left) {

		this.left = left;
	}

	public Node<T> getRight() {

		return right;
	}

	public void setRight(Node<T> right) {

		this.right = right;
	}

	/**
	 * 
	 * 前序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 12:48:39 PM
	 */
	public void preOrder() {

		// 先输出当前节点
		System.out.println(this.data.toString());

		// 向左子树遍历
		if (this.left != null) {
			this.left.preOrder();
		}

		// 向右子树遍历
		if (this.right != null) {
			this.right.preOrder();
		}
	}

	/**
	 * 
	 * 前序遍历查找
	 * 
	 * @param findVal
	 * @return
	 * @author yaobj
	 * @date Jan 14, 2021 2:18:07 PM
	 */
	public T preOrderSearch(T findVal) {

		// 先输出当前节点
		if (findVal.equals(this.data)) {
			return this.data;
		}
		// 向左子树遍历
		if (this.left != null) {
			T result = this.left.preOrderSearch(findVal);
			if (result != null) {
				return result;
			}
		}

		// 向右子树遍历
		if (this.right != null) {
			T result = this.right.preOrderSearch(findVal);
			if (result != null) {
				return result;
			}
		}

		return null;
	}

	/**
	 * 
	 * 中序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 12:53:25 PM
	 */
	public void infixOrder() {

		// 向左子树遍历
		if (this.left != null) {
			this.left.infixOrder();
		}

		// 输出当前节点
		System.out.println(this.data.toString());

		// 向右子树遍历
		if (this.right != null) {
			this.right.infixOrder();
		}

	}

	/**
	 * 
	 * 后序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 12:59:41 PM
	 */
	public void postOrder() {

		// 向左子树遍历
		if (this.left != null) {
			this.left.postOrder();
		}

		// 向右子树遍历
		if (this.right != null) {
			this.right.postOrder();
		}

		// 输出当前节点
		System.out.println(this.data.toString());
	}
	
	//删除节点
	public boolean delNode(T data) {
		
		// 判断左节点是否删除
		if(this.left!=null && this.left.data.equals(data)) {
			this.left = null;
			return true;
		}
		
		// 判断右节点是否删除
		if(this.right != null && this.right.data.equals(data)) {
			this.right = null;
			return true;
		}
		
		// 向左递归删除
		if(this.left !=null) {
			if(this.left.delNode(data)) {
				return true;
			}
		}
		
		// 向右递归删除
		if(this.right !=null) {
			if(this.right.delNode(data)) {
				return true;
			}
		}
		
		return false;
	}
}

