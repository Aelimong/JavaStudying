package step01_����;


/*
 * ���� ������ �����Ͽ� ��� �ϼ���
 * 
 * ---���
 * �̸� : �̼���     <--println()
 * ���� : 25��    <--print()
 * �μ� : ���ߺ�
 * ���� : 87.5��   <--printf()
 * */

public class Test {

	public static void main(String[] args) {
         String name="�̼���";
         int age=25;
         String team="���ߺ�";
         float score=87.5f;
         
         System.out.println("�̸� : "+name+"");
         System.out.print("���� : "+age+"��\n");
         System.out.printf("�μ�: %s\n����: %-1.1f��\n", team, score);
         

	}

}
