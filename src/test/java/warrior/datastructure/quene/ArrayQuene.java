package warrior.datastructure.quene;

import java.util.Arrays;

public class ArrayQuene {

	private String[] queue = null;

	private int lenght = 0;

	public ArrayQuene(int length) {

		queue = new String[length];
		this.lenght = length;
	}

	// 队列头
	int head = 0;

	// 队列尾
	int tail = 0;

	// 进入队列
	public void put(String item) {

		if (isFull()) {
			System.out.println("队列已满");
		} else {
			int index = tail % lenght;
			queue[index] = item;
			tail++;
			System.out.println("添加队列元素：队列头-" + head + ",队列尾-" + tail);
		}
	}

	// 判断队列是否已满
	public boolean isFull() {

		return tail != 0 && tail % lenght == head;
	}

	// 判断队列是否为空
	public boolean isEmpty() {

		return head == tail;
	}

	// 出队列
	public String get() {

		if (isEmpty()) {
			System.out.println("队列已空");
			return "";
		} else {
			int index = head % lenght;
			String item = queue[index];
			queue[index] = null;
			head++;
			System.out.println("获取队列元素：队列头-" + head + ",队列尾-" + tail);
			return item;
		}

	}

	public String toString() {

		return Arrays.asList(queue).toString();
	}

}
