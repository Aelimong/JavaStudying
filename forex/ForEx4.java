package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.lang.Math;


/* BuferredReader를 이용하여 작성
 * 
 * 1. 문자를 입력받기 (대문자)
 * 2. 랜덤하게 대문자 30개를 발생하여 화면에 출력
 * 3. 발생한 문자중에 입력한 문자가 몇개인지 출력하기
 * 
 * ----결과
 * 문자 입력 :K
 * X F G D H.....K W E
 * 
 * K의 개수 : 5
 * 
 * 
 * 입력문, 포문, 랜덤, 
 * */

public class ForEx4 {

	public static void main(String[] args) throws IOException {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      Random rd=new Random();
      
      char result;
      char alpa;
      int num=0;
      
      System.out.print("문자 입력 : ");
		result=br.readLine().charAt(0);
		
		
		for(int i=1; i<30; i++) {
	     alpa=(char)(Math.random()*26+65);	
	     System.out.print(alpa+" ");
	     
	     if(result == alpa) {
			++num;
		}
		}
		
		System.out.println("\n"+result+"의 개수 : "+num);
	
		
		
		/*
		
		char sum;
		for(char alpa='A'; alpa<='Z'; alpa++) {	
			
			sum=alpa++;
			
	          System.out.println(A+"의 개수 : "+alpa);
		}
		*/

		
		
		
	}

}
