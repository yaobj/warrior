package warrior.datastructure.quene;

import java.util.Scanner;

public class CircleArrayQueueDemo {

	public static void main(String[] args) {

		CircleArray queue = new CircleArray(4); //˵������4, ����е���Ч���������3
		char key = ' '; // �����û�����
		Scanner scanner = new Scanner(System.in);//
		boolean loop = true;
		// ���һ���˵�
		while (loop) {
			System.out.println("s(show): ��ʾ����");
			System.out.println("e(exit): �˳�����");
			System.out.println("a(add): ������ݵ�����");
			System.out.println("g(get): �Ӷ���ȡ������");
			System.out.println("h(head): �鿴����ͷ������");
			key = scanner.next().charAt(0);// ����һ���ַ�
			switch (key) {
			case 's':
				queue.showQueue();
				break;
			case 'a':
				System.out.println("请输入一个数");
				int value = scanner.nextInt();
				queue.addQueue(value);
				break;
			case 'g': // ȡ������
				try {
					int res = queue.getQueue();
					System.out.printf("ȡ����������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'h': // �鿴����ͷ������
				try {
					int res = queue.headQueue();
					System.out.printf("����ͷ��������%d\n", res);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			case 'e': // �˳�
				scanner.close();
				loop = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�����˳�~~");
	}

}

class CircleArray {

	private int maxSize;

	private int front;

	private int rear;

	private int[] arr;

	public CircleArray(int arrMaxSize) {

		maxSize = arrMaxSize;
		arr = new int[maxSize];
	}

	public boolean isFull() {

		return (rear + 1) % maxSize == front;
	}

	public boolean isEmpty() {

		return rear == front;
	}

	public void addQueue(int n) {

		if (isFull()) {
			System.out.println("队列已满~");
			return;
		}

		arr[rear] = n;

		rear = (rear + 1) % maxSize;
	}

	public int getQueue() {

		if (isEmpty()) {

			throw new RuntimeException("队列已空");
		}

		int value = arr[front];
		front = (front + 1) % maxSize;
		return value;

	}

	public void showQueue() {

		if (isEmpty()) {
			System.out.println("队列是空的~~");
			return;
		}

		for (int i = front; i < front + size(); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
		}
	}

	public int size() {

		// rear = 2
		// front = 1
		// maxSize = 3 
		return (rear + maxSize - front) % maxSize;
	}

	public int headQueue() {

		if (isEmpty()) {
			throw new RuntimeException("队列是空的~~");
		}
		return arr[front];
	}
}