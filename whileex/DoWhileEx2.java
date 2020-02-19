package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*다시 한번 실행할까요(y/Y)? Y
 *다시 한번 실행할까요(y/Y)? y
 *다시 한번 실행할까요(y/Y)? n
 * 
 * 수고하셨습니다
 * */

public class DoWhileEx2{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char A;  //한 글자 3. 변수 설정(값이 안 정해진 경우 입력해서 할 수 있도록 입력어 처리해야함)
		do { 
			System.out.print("다시 한번 실행할까요(y/Y)?"); //1.보고싶은 메시지 먼저 출력
			A=br.readLine().charAt(0); //4.입력어처리
			     //잘못 입력할 수도 있으니(에러) 예외상황 처리해야함
			
		} while(A=='y' || A=='Y'); //2. if,while(여기는 무조건 조건,검사할 변수가 필요함)
			
		  System.out.println("**수고하셨습니다**");

}
}
