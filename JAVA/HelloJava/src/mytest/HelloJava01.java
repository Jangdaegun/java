package mytest;

import java.util.Arrays;
import java.util.Scanner;


public class HelloJava01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b = 3.14;
		char c = '��';

		boolean d = false;
		String f = "�ȳ��ϼ���";
		
		f = f + " �̼����� !";
		System.out.println(f);
		
		Scanner s = new Scanner(System.in);
		f = s.nextLine();
		System.out.println(f+"�Ե� ȯ���ؿ�!");
		
//		int random = (int)(Math.random()*45)+1;
//		System.out.println(random);
//		
//
//		int[] lotto = new int[6];
//		lotto[0] = random;
//		for(int i = 0; i<lotto.length; i++)
//		{
//			lotto[i] = i*10;
//			System.out.println(lotto[i]);
//		}
		
		System.out.println("���ζǹ�ȣ ���� ������"); 
		System.out.println("�� ȸ �Է�?");
		
		int cnt = s.nextInt();
		int idx_num = 0;
		int lotto_num[] = new int[6]; 
		String result_txt;
		
		for(int i=1; i<=cnt*6; i++){ 
			
			result_txt = "";
			result_txt += idx_num+1+"ȸ : [ "; 
			
			for(int j=0; j<=5; j++){
				int num_temp = (int) (Math.random()*45+1);
				lotto_num[j] = num_temp; 
			} 
			
			Arrays.sort(lotto_num); 
			

			boolean duple = false;
			for(int k=0; k<lotto_num.length; k++){ 
				
				if(k==lotto_num.length-1) {  
					result_txt += lotto_num[k]+" ]"; 
					
				}else if(lotto_num[k]!=lotto_num[k+1]){ 
					result_txt += lotto_num[k]+",\t"; 
					
				}else { 
					duple = true;
				}
			}
			
			if(idx_num==cnt)break; 
			
			if(duple==false) { 
				idx_num++;
				System.out.println(result_txt);	
			}
		}
	}

}
