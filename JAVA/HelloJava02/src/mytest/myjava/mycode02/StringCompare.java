package mytest.myjava.mycode02;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� ���ڿ�");
		String s1 = sc.nextLine();
		System.out.println("2���� ���ڿ�");
		String s2 = sc.nextLine();
		
		//System.out.println(s1.equals(s2));
		if(s1.length() != s2.length()) {
			System.out.println("�ٸ�");
			return;
		}
		
		boolean isSame = true;
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i = 0; i<c1.length; i++)
		{
			if(c1[i]!=c2[i])
			{
				isSame = false;
				break;
			}
		}
		if(isSame)
			System.out.println("�Ȱ��� ���ڿ���");
		else
			System.out.println("�ٸ� ���ڿ���");
	}

}
