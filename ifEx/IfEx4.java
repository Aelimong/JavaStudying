package ifEx;
/* ��øif�� ��� 
 * 3�� ������ ������ �Է� �޾� �հ� ���հ� ����ϱ� 
 * 3�� ������ ���� 40 �̻��̾�� �ϰ� ����� 60�̻��̾�� "�հ�"
 * ����� 60�� ������ 1���� �����̶� 40�̸��̶�� "�������� ���հ�"
 * ����� 60 �̸��̸� "���հ�" ��� 
 * 
 * --��� 
 * ���� ���� �Է� : 55
 * ���� ���� �Է� : 50
 * ���� ���� �Է� : 45
 * ��� = ���հ� 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(
							new InputStreamReader(System.in));
		int k, e, m, tot;
		double avg;
		
		System.out.print("���� ���� �Է� : ");
		k=Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		e=Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		m=Integer.parseInt(br.readLine());
		
		tot=k+e+m;
		avg=tot/3.0;
		
		if(avg>=60) {
			if(k<40 || e<40 || m<40) {
				System.out.println("�������� ���հ�");
			}
			else {
				System.out.println("�հ�");
			}
			
		}
		else {
			System.out.println("���հ�");
		}
		

	}

}


















