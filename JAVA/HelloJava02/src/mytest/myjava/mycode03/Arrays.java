package mytest.myjava.mycode03;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][3];
		int k = 10;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = k * (i + 1) * (j + 1);
				if (i == 1 && j == 2)
					arr[i][j] = 0;
				System.out.println((i + 9) + "�� " + (j + 1) + "���ǽ� : " + arr[i][j] + "��");
			}
			System.out.println();
		}
		int avg10 = 0;
		int avg9 = 0;
		for (int i = 0; i < 3; i++) {
			avg10 += arr[1][i];
			avg9 += arr[0][i];
		}
		avg9 = avg9 / 3;
		avg10 = avg10 / 3;

		System.out.println("9�� ��� �ο� : " + avg9);
		System.out.println("10�� ��� �ο� : " + avg10);

	}

}
