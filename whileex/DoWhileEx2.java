package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�ٽ� �ѹ� �����ұ��(y/Y)? Y
 *�ٽ� �ѹ� �����ұ��(y/Y)? y
 *�ٽ� �ѹ� �����ұ��(y/Y)? n
 * 
 * �����ϼ̽��ϴ�
 * */

public class DoWhileEx2{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char A;  //�� ���� 3. ���� ����(���� �� ������ ��� �Է��ؼ� �� �� �ֵ��� �Է¾� ó���ؾ���)
		do { 
			System.out.print("�ٽ� �ѹ� �����ұ��(y/Y)?"); //1.������� �޽��� ���� ���
			A=br.readLine().charAt(0); //4.�Է¾�ó��
			     //�߸� �Է��� ���� ������(����) ���ܻ�Ȳ ó���ؾ���
			
		} while(A=='y' || A=='Y'); //2. if,while(����� ������ ����,�˻��� ������ �ʿ���)
			
		  System.out.println("**�����ϼ̽��ϴ�**");

}
}
