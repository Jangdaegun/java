package mytest.myjava.mycode;

import java.util.Scanner;

public class YourJava {

	public static void main(String[] args) {
		int a  = 35;
		short aa = (short)10;
		double b = 3.14;
		float bb = (float)3.1415;
		char c = 'A';
		char cc = '��';
		
		boolean d = false;
		d = true;
		
		String f = "�ȳ��ϼ���~!";
		f += " �̵��� ������~! ";		
		System.out.println(f);
		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� ���ð� �Ẹ����.");
		f += s.nextLine();
		System.out.println("���� ���?");
		int age = s.nextInt(); 
		s.nextLine(); 
		System.out.println("���� �¾��?");
		int birthYear = Integer.parseInt(s.nextLine());
		System.out.println("�� ���� : " + (2023-birthYear));
	}
}
