package warrior.datastructure.tree;

/**
 * 
 * 	线索化二叉树 
 * @author 姚斌杰
 * @date 2021年1月16日 下午12:26:28 
 * 
 *
 */
public class ThreadedBinaryTreeDemo {

	public static void main(String[] args) {

		Node<String> node1  = new Node<String>("1");
		Node<String> node2  = new Node<String>("3");
		Node<String> node3  = new Node<String>("6");
		Node<String> node4  = new Node<String>("8");
		Node<String> node5  = new Node<String>("10");
		Node<String> node6  = new Node<String>("14");
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		
		ThreadedBinaryTree<String> threadedBinaryTree = new ThreadedBinaryTree<String>(node1);
		threadedBinaryTree.threadNode();
		
		System.out.println("");
		
		threadedBinaryTree.listThreadedBinaryTree();
	}

}

class ThreadedBinaryTree<T>{
	
	/**
	 * 根节点
	 */
	private Node<T> root;
	
	/**
	 * 前驱节点
	 */
	private Node<T> preNode;
	public ThreadedBinaryTree(Node<T> root) {
		this.root = root;
	}
	
	public void  threadNode() {
		this.threadNode(root);
	}
	
	
	/**
	 * 
	 * 中序线索化 
	 * @param node
	 * @author 姚斌杰 
	 * @date 2021年1月16日 上午11:16:01
	 */
	public void  threadNode(Node<T> node) {
		
		// 节点为空直接返回
		if(node == null) {
			return;
		}
		
		// 线索化左子树
		threadNode(node.getLeft());
		
		// 线索化当前节点 
		// 处理前驱节点
		if(node.getLeft() == null) {
			node.setLeft(preNode);
			node.setLeftType(1);
		}	
				
		// 处理后继节点
		if(preNode!=null && preNode.getRight() == null) {
			preNode.setRight(node);
			preNode.setRightType(1);
		}
		
		// 当前节点是下一个节点的前驱节点
		preNode = node;		
		
		// 线索化右子树
		threadNode(node.getRight());
				
	}
	
	public void listThreadedBinaryTree() {
		Node<T> node = root;
		
		while(node !=null) {
			while(node.getLeftType() == 0) {
				node = node.getLeft();
			}
			
			System.out.println(node.getData());
			
			while(node.getRightType() == 1) {
				node = node.getRight();
				System.out.println(node.getData());
			}
			
			node = node.getRight();
		}
 	}
}