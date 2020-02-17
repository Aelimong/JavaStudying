package object;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	

		System.out.print("문자열 : ");
		String str=sc.nextLine();
		
		System.out.print("정수 : ");
		int a=sc.nextInt();
		
		System.out.print("실수 : ");
		double b=sc.nextDouble();
      // sc.nextLine(); //버퍼 비우기      엔터누르면  \r\n 생기는데 이걸 실수와 묶어서 인식하는 경우가 있음
		
		System.out.print("문자 : ");
		char c=sc.next().charAt(0);
		    //  next 단어 단위로 인식할 수 있는 것
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}

}
