package step02_������;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;
//		int tax=(int)0.033;  //����ȯ�� �º��� �������� �캯�� ��ȯ 
		//�º��� �캯�� ��ġ�ǵ��� ����� �ٰ� 
		
		int rPay=pay-(int)(pay*tax);
		
		System.out.println("�� ���ɾ� : "+ rPay);
		
		
		/*
		int k=87, e=88, m=75;
		int tot=k+e+m;
//		double avg=tot/3;   //  (����/����)=>����
//		double avg=(double)tot/3;   //�ڵ�����ȯ
		double avg=tot/3.0;			//�ڵ�����ȯ
		
		
		System.out.println("���� : "+tot);
		System.out.printf("��� : %.2f", avg);
		*/
		//---------------------------------------
		
		/*
		byte a=100;
		int b=a; 		//�ڵ� ����ȯ 
		
		double c=73.45;
		int d=(int)c;	// ���� ����ȯ 
		
		System.out.println(a + "  "+ b);
		System.out.println(c + "  "+ d);
		*/
		

	}

}

















