package step02_연산자;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;
//		int tax=(int)0.033;  //형변환은 좌변을 기준으로 우변을 변환 
		//좌변과 우변이 일치되도록 만들어 줄것 
		
		int rPay=pay-(int)(pay*tax);
		
		System.out.println("실 수령액 : "+ rPay);
		
		
		/*
		int k=87, e=88, m=75;
		int tot=k+e+m;
//		double avg=tot/3;   //  (정수/정수)=>정수
//		double avg=(double)tot/3;   //자동형변환
		double avg=tot/3.0;			//자동형변환
		
		
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.2f", avg);
		*/
		//---------------------------------------
		
		/*
		byte a=100;
		int b=a; 		//자동 형변환 
		
		double c=73.45;
		int d=(int)c;	// 강제 형변환 
		
		System.out.println(a + "  "+ b);
		System.out.println(c + "  "+ d);
		*/
		

	}

}


















