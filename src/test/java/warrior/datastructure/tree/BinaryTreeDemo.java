package warrior.datastructure.tree;

public class BinaryTreeDemo {

	public static void main(String[] args) {

		BinaryTree<String> binaryTree = new BinaryTree<String>();

		Node<String> root = new Node<String>("松江");
		Node<String> node2 = new Node<String>("吴用");
		Node<String> node3 = new Node<String>("卢俊义");
		Node<String> node4 = new Node<String>("林冲");
		root.setLeft(node2);
		root.setRight(node3);
		node3.setRight(node4);
		binaryTree.setRoot(root);

		binaryTree.preOrder();
		System.out.println("****************************");
		binaryTree.infixOrder();
		System.out.println("****************************");
		binaryTree.postOrder();
		System.out.println("****************************");
		binaryTree.preOrderSearch("haha");
		binaryTree.preOrderSearch("林冲");

	}
}

class BinaryTree<T> {

	private Node<T> root;

	public void add(T data) {

	}

	public Node<T> getRoot() {

		return root;
	}

	public void setRoot(Node<T> root) {

		this.root = root;
	}

	/**
	 * 前序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 1:09:16 PM
	 */
	public void preOrder() {

		if (this.root != null) {
			this.root.preOrder();
		} else {
			System.out.println("二叉树为空～");
		}
	}

	public T preOrderSearch(T findVal) {

		if (this.root == null) {
			System.out.println("未查找到～");
			return null;
		}
		T result = this.root.preOrderSearch(findVal);
		if (result == null) {
			System.out.println("未查找到～");
		} else {
			System.out.println("查到数据：" + result.toString());
		}
		return result;
	}

	/**
	 * 
	 * 中序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 1:09:30 PM
	 */
	public void infixOrder() {

		if (this.root != null) {
			this.root.infixOrder();
		} else {
			System.out.println("二叉树为空～");
		}
	}

	/**
	 * 
	 * 后序遍历
	 * 
	 * @author yaobj
	 * @date Jan 14, 2021 1:09:41 PM
	 */
	public void postOrder() {

		if (this.root != null) {
			this.root.postOrder();
		} else {
			System.out.println("二叉树为空～");
		}
	}

}

/**
 * 
 * 定义节点类
 * 
 * @author yaobj
 * @date Jan 14, 2021 12:45:19 PM
 *
 * @param <T>
 *
 */
class Node<T> {

	public Node(T data) {

		this.data = data;
	}

	private T data;

	/**
	 * 左节点
	 */
	private Node<T> left;

	/**
	 * 右节点
	 */
	private Node<T> right;

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

}
