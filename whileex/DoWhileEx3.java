package whileex;

import java.util.Random;

// do while ��
//65~90 ������ ���� 10 �����ϱ�
//78 66 ... 88


public class DoWhileEx3 {

	public static void main(String[] args) {
		Random rd=new Random();
		
		int cnt=0;  //4.����
		do {			
			int num=rd.nextInt(26)+65; //1.��������
            System.out.print(num+" ");  //2.���
            ++cnt; //3.������
            
		} while(cnt<10); //5.����

	}
}
