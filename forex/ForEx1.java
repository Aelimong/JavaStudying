package forex;

/* for(�ʱⰪ; ���ǽ�; ������;  {} ==> for(int i=0; i<10; i++){}
 *
 */

public class ForEx1 {

	public static void main(String[] args) {
        
		
	for(int i=100; i>=80; i-=3) {
		System.out.print(i+" ");
	}
		
		/*A B C ... Y Z
		
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		
		//char+int=int  /// char+char=int
		
		/*Ȧ�� ���� ����ϼ��� 
		int sum=0, odd=0, even=0;
		
		for(int i=1; i<=100;i++) {
		                    //������ ������ �� �� ���� 1�� ����
		    sum+=i;
		    
		 switch(i%2) {
		 case 1: odd+=i; break;
		 case 0: even+=i; break;
	     }
		
        }
		System.out.println("�հ� : "+sum);
		System.out.println("Ȧ�� �� : "+odd);
		System.out.println("¦�� �� : "+even);
		
		*/
		
}
}