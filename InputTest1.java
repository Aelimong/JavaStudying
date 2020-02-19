package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//콘솔 : 표준 입출력 장치


public class InputTest1 {

	public static void main(String[] args) throws IOException {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      
      String name;
      char gender;
      int age;
      float weight;
      double tall;
      
      
      System.out.print("이름을 입력하세요 : ");      
      name=br.readLine();
      
      System.out.print("성별을 입력하세요 : ");      
      gender=br.readLine().charAt(0);  //리드라인이 아니더라도 다른 곳에서 사용가능
      // charAt(1) : 문자 1개 추출
      // i는 추출하고자 하는 값의 인덱스
      // 입력은 charAt(1) 앞에 기술
      
      System.out.print("한글과 컴퓨터".charAt(2));
      
      
      System.out.print("나이를 입력하세요 : ");      
      age=Integer.parseInt(br.readLine());
      
      System.out.print("체중을 입력하세요 : ");      
      weight=Float.parseFloat(br.readLine());
      
      System.out.print("신장을 입력하세요 : ");      
      tall=Double.parseDouble(br.readLine());
      
      
      
     // . 1)포함  2)입력
      
      
      System.out.println("이름 : "+name);
      System.out.println("성별 : "+gender);
      System.out.println("나이 : "+age);
		
		
	}

}
