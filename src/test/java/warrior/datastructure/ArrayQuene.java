package warrior.datastructure;

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

		if (tail < lenght) {
			queue[tail] = item;
			tail++;
			System.out.println("添加队列元素：队列头-" + head + ",队列尾-" + tail);
		} else {
			if (head == 0) {
				System.out.println("队列已满");
			} else {

				int a = 0;
				for (int i = head; i < lenght; i++) {
					queue[a] = queue[i];
					queue[i] = null;
					a++;
				}
				tail = tail - head;
				head = 0;

				put(item);

			}

		}
	}

	// 出队列
	public String get() {

		if (head < tail) {

			String item = queue[head];
			queue[head] = null;
			head++;
			System.out.println("获取队列元素：队列头-" + head + ",队列尾-" + tail);
			return item;
		} else {
			System.out.println("队列已空");
			return "";
		}
	}

	public String toString() {

		return Arrays.asList(queue).toString();
	}

}
