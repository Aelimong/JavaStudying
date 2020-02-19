package whileex;

import java.util.Random;

// do while 문
//65~90 사이의 난수 10 생성하기
//78 66 ... 88


public class DoWhileEx3 {

	public static void main(String[] args) {
		Random rd=new Random();
		
		int cnt=0;  //4.선언
		do {			
			int num=rd.nextInt(26)+65; //1.난수생설
            System.out.print(num+" ");  //2.출력
            ++cnt; //3.증감식
            
		} while(cnt<10); //5.조건

	}
}
