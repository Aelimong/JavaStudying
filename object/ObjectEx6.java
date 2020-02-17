package object;

import java.util.Scanner;

class MemberPhone{
	private String name;
	private String phone;


//한 패키지에 동일한 클래스 이름은 존재할 수 없음

  public void input() {
	  Scanner sc=new Scanner(System.in);
      System.out.print("이름을 입력하세요 : ");
      name=sc.nextLine();
     
      System.out.print("전화를 입력하세요 : ");
      phone=sc.nextLine();
      sc.close();  //버퍼트 리드 사용할 때 꼭 닫아줘야함, 외부장치와 연결 될 때도 닫아줘야함
      
  }

  public void output() {
	 System.out.println(name+"고객님의 전화번호는 "+phone+"입니다");
  }

}

public class ObjectEx6 {

	public static void main(String[] args) {

		MemberPhone mp= new MemberPhone();
		mp.input();
		mp.output();
		
	}

}
