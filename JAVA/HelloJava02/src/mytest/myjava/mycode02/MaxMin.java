package mytest.myjava.mycode02;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� ���� ������ ������?");
		int N = sc.nextInt();
		int arr[] = new int[N];

		System.out.println(N+"�� ���� �Է�");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int max_index = 0;
		int min_index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
			{
				max = arr[i];
				max_index = i;				
			}
			if (arr[i] < min) {
				min = arr[i];
				min_index = i;
			}
		}
		System.out.println("�Է¹��� ���� �迭 : " + Arrays.toString(arr));
		System.out.println("�ּҰ� index : " + min_index);
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 index : " + max_index);
		System.out.println("�ִ밪 : " + max);
	}

}
