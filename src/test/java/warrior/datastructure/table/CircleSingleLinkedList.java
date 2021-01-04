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

	private Node first = null;

	private Node last = null;

	class Node<T> {

		public Node(T data) {

			this.data = data;
		}

		T data;

		private Node next;

	}

	public void add(T data) {

		Node newNode = new Node(data);

		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;

		}
		newNode.next = first;

	}

}
