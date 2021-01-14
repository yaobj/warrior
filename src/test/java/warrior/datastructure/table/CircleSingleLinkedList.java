package warrior.datastructure.table;

/**
 * 
 * 环形单向链表
 * 
 * @author yaobj
 * @date Dec 17, 2020 10:43:24 AM
 *
 * @param <T>
 *
 */
public class CircleSingleLinkedList<T> {

	private Node<T> first = null;

	private Node<T> last = null;

	public void add(T data) {

		Node<T> newNode = new Node<T>(data);

		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;

		}
		newNode.next = first;

	}

}

class Node<T> {

	public Node(T data) {

		this.data = data;
	}

	T data;

	public Node<T> next;

}
