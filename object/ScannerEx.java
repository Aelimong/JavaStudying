package object;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	

		System.out.print("���ڿ� : ");
		String str=sc.nextLine();
		
		System.out.print("���� : ");
		int a=sc.nextInt();
		
		System.out.print("�Ǽ� : ");
		double b=sc.nextDouble();
      // sc.nextLine(); //���� ����      ���ʹ�����  \r\n ����µ� �̰� �Ǽ��� ��� �ν��ϴ� ��찡 ����
		
		System.out.print("���� : ");
		char c=sc.next().charAt(0);
		    //  next �ܾ� ������ �ν��� �� �ִ� ��
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}

}
