package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ܼ� : ǥ�� ����� ��ġ


public class InputTest1 {

	public static void main(String[] args) throws IOException {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      
      String name;
      char gender;
      int age;
      float weight;
      double tall;
      
      
      System.out.print("�̸��� �Է��ϼ��� : ");      
      name=br.readLine();
      
      System.out.print("������ �Է��ϼ��� : ");      
      gender=br.readLine().charAt(0);  //��������� �ƴϴ��� �ٸ� ������ ��밡��
      // charAt(1) : ���� 1�� ����
      // i�� �����ϰ��� �ϴ� ���� �ε���
      // �Է��� charAt(1) �տ� ���
      
      System.out.print("�ѱ۰� ��ǻ��".charAt(2));
      
      
      System.out.print("���̸� �Է��ϼ��� : ");      
      age=Integer.parseInt(br.readLine());
      
      System.out.print("ü���� �Է��ϼ��� : ");      
      weight=Float.parseFloat(br.readLine());
      
      System.out.print("������ �Է��ϼ��� : ");      
      tall=Double.parseDouble(br.readLine());
      
      
      
     // . 1)����  2)�Է�
      
      
      System.out.println("�̸� : "+name);
      System.out.println("���� : "+gender);
      System.out.println("���� : "+age);
		
		
	}

}
