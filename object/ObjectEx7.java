package object;

import java.util.Scanner;

/*  ***��ٸ� ���� ���� ���ϱ�***
 * �غ��� �Է��ϼ��� : 5
 * ������ �Է��ϼ��� : 4
 * ���̸� �Է��ϼ��� : 3
 * 
 * ���� : 13.5
 * 
 * �ѹ� �� ����ұ��?(Y/y) n
 * ***�����ϼ̽��ϴ�***
 * 
 * ��ĳ��
 * do-while ��� (�Է�ó��/���ó��/�����?���ǰ˻�)
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
		System.out.println("***��ٸ� ���� ���� ���ϱ�***");
		System.out.print("�غ��� �Է��ϼ��� : ");
		base=sc.nextInt();
		
		System.out.print("������ �Է��ϼ��� : ");
		top=sc.nextInt();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		height=sc.nextInt();
		
		tr.setTrapezoid(base, top, height);
	
		System.out.println(tr.toString());
		
		System.out.print("�ѹ� �� ����ұ��?(Y/y)");
		A=sc.next().charAt(0);
		
		} while (A=='Y' || A=='y');  //���ǰ˻�
		
		 sc.close(); //�����ϱ� �ٷ� ������!!
		 System.out.println("***�����ϼ̽��ϴ�***");
		
	}

}
