package study01_method;

import java.util.Scanner;

public class method01 {

	static void Hello() {
		System.out.println("Hello!");
	}

	static void Hi(String name) {
		System.out.println("Hi" + name + "!");
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int power() {
		System.out.println("������ �� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		return num * num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello();
		Hi("�ٳ�ī");
		System.out.println(add(1, 2));
		int s = add(10, 20);
		System.out.println(s);
		System.out.println(power());
	}

}
