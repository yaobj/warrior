package warrior.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CalculatorByStack {

	public static void main(String[] args) {

		// 操作数据
		Stack<Integer> numStack = new Stack<Integer>();

		// 操作符
		Stack<String> operStack = new Stack<String>();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入计算公式：");

		String operStr = scanner.nextLine();

		char[] oper = operStr.toCharArray();

		Stack<String> s1 = new Stack<String>();

		List<String> s2 = new ArrayList<String>();
		for (char c : oper) {
			set(s1, s2, c);
		}
		while (s1.size() != 0) {
			s2.add(s1.pop());
		}
		int result = 0;
		for (String item : s2) {
			if (!isOperStr(item)) {
				numStack.push(Integer.parseInt(item));
			} else {
				int num1 = numStack.pop();
				int num2 = numStack.pop();
				result = cal(num1, num2, item);
				numStack.push(result);
			}
		}

		System.out.println(s2);
		System.out.println("结果：" + result);

	}

	public static void push(Stack<Integer> numStack, Stack<String> operStack, String a) {

		if (operStack.isEmpty()) {
			operStack.push(a);
		} else {
			String b = operStack.pop();
			int result = comparePriority(a, b);
			if (result <= 0) {
				int num1 = numStack.pop();
				int num2 = numStack.pop();
				numStack.push(cal(num1, num2, b));
				push(numStack, operStack, a);
			} else {
				operStack.push(b);
				operStack.push(a);
			}
		}

	}

	public static int cal(int num1, int num2, String operStr) {

		int result = 0;
		if ("+".equals(operStr)) {
			result = num1 + num2;
		}
		if ("-".equals(operStr)) {
			result = num2 - num1;
		}
		if ("*".equals(operStr)) {
			result = num1 * num2;
		}
		if ("/".equals(operStr)) {
			result = num2 / num1;
		}

		//		System.out.println("result:" + result);
		return result;

	}

	public static boolean isOperStr(String a) {

		List<String> add = Arrays.asList("+", "-", "*", "/");

		return add.contains(a);

	}

	// 判断两操作符的优先级
	public static int comparePriority(String a, String b) {

		List<String> add = Arrays.asList("+", "-");
		List<String> mult = Arrays.asList("*", "/");

		if ((add.contains(a) && add.contains(b)) || (mult.contains(a) && mult.contains(b))) {
			return 0;
		}

		if (add.contains(a) && mult.contains(b)) {
			return -1;
		}

		if (add.contains(b) && mult.contains(a)) {
			return 1;
		}
		return 0;
	}

	// 中缀表达式转换为后缀表达式（逆波兰表达式）
	public void transfer(char[] oper) {

	}

	private static void set(Stack<String> s1, List<String> s2, char c) {

		String a = String.valueOf(c);

		if (a.equals("(")) {
			s1.push(a);
		} else if (a.equals(")")) {

			while (!s1.peek().equals("(")) {
				s2.add(s1.pop());
			}
			// 将小括号丢弃
			s1.pop();
		} else if (isOperStr(a)) {
			// 如果是个符号
			// 当栈顶的优先级大于等于a时
			while (s1.size() != 0 && comparePriority(s1.peek(), a) >= 0) {
				s2.add(s1.pop());
			}
			s1.push(a);
		} else {
			s2.add(a);
		}

	}

}
