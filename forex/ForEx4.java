package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.lang.Math;


/* BuferredReader�� �̿��Ͽ� �ۼ�
 * 
 * 1. ���ڸ� �Է¹ޱ� (�빮��)
 * 2. �����ϰ� �빮�� 30���� �߻��Ͽ� ȭ�鿡 ���
 * 3. �߻��� �����߿� �Է��� ���ڰ� ����� ����ϱ�
 * 
 * ----���
 * ���� �Է� :K
 * X F G D H.....K W E
 * 
 * K�� ���� : 5
 * 
 * 
 * �Է¹�, ����, ����, 
 * */

public class ForEx4 {

	public static void main(String[] args) throws IOException {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      Random rd=new Random();
      
      char result;
      char alpa;
      int num=0;
      
      System.out.print("���� �Է� : ");
		result=br.readLine().charAt(0);
		
		
		for(int i=1; i<30; i++) {
	     alpa=(char)(Math.random()*26+65);	
	     System.out.print(alpa+" ");
	     
	     if(result == alpa) {
			++num;
		}
		}
		
		System.out.println("\n"+result+"�� ���� : "+num);
	
		
		
		/*
		
		char sum;
		for(char alpa='A'; alpa<='Z'; alpa++) {	
			
			sum=alpa++;
			
	          System.out.println(A+"�� ���� : "+alpa);
		}
		*/

		
		
		
	}

}
