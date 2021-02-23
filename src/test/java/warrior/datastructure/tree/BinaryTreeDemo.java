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

//		binaryTree.preOrder();
//		System.out.println("****************************");
//		binaryTree.infixOrder();
//		System.out.println("****************************");
//		binaryTree.postOrder();
//		System.out.println("****************************");
//		binaryTree.preOrderSearch("haha");
//		binaryTree.preOrderSearch("林冲");
		
		binaryTree.delNode("hh");
		binaryTree.preOrder();
		binaryTree.delNode("林冲");
		binaryTree.preOrder();
		

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
	
	
	/**
	 * 
	 * 删除节点 
	 * @param data
	 * @author 姚斌杰 
	 * @date 2021年1月14日 下午9:48:09
	 */
	public void delNode(T data) {
		
		if(this.root == null) {
			System.out.println("二叉树为空~");
		} else {
			boolean success = this.root.delNode(data);
			if(success) {
				System.out.println("删除成功~");
			} else {
				System.out.println("删除失败~");
			}
		}
		
	}

}


