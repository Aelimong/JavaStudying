package object;

import java.util.Scanner;

/*  ***사다리 꼴의 넓이 구하기***
 * 밑변을 입력하세요 : 5
 * 윗변을 입력하세요 : 4
 * 높이를 입력하세요 : 3
 * 
 * 넓이 : 13.5
 * 
 * 한번 더 계산할까요?(Y/y) n
 * ***수고하셨습니다***
 * 
 * 스캐너
 * do-while 사용 (입력처리/계산처리/재수행?조건검사)
 * 
 * 
 * 
 */


public class ObjectEx7 {

	public static void main(String[] args) {
    
		Trapezoid tr=new Trapezoid();
		Scanner sc=new Scanner(System.in);
		int base, top, height;
		char A;
		do {
		System.out.println("***사다리 꼴의 넓이 구하기***");
		System.out.print("밑변을 입력하세요 : ");
		base=sc.nextInt();
		
		System.out.print("윗변을 입력하세요 : ");
		top=sc.nextInt();
		
		System.out.print("높이를 입력하세요 : ");
		height=sc.nextInt();
		
		tr.setTrapezoid(base, top, height);
	
		System.out.println(tr.toString());
		
		System.out.print("한번 더 계산할까요?(Y/y)");
		A=sc.next().charAt(0);
		
		} while (A=='Y' || A=='y');  //조건검사
		
		 sc.close(); //종료하기 바로 직전에!!
		 System.out.println("***수고하셨습니다***");
		
	}

}
