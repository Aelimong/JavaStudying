package forex;

/* for(초기값; 조건식; 증강식;  {} ==> for(int i=0; i<10; i++){}
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
		
		/*홀수 합을 출력하세요 
		int sum=0, odd=0, even=0;
		
		for(int i=1; i<=100;i++) {
		                    //실행이 끝나고 난 뒤 부터 1씩 증가
		    sum+=i;
		    
		 switch(i%2) {
		 case 1: odd+=i; break;
		 case 0: even+=i; break;
	     }
		
        }
		System.out.println("합계 : "+sum);
		System.out.println("홀수 합 : "+odd);
		System.out.println("짝수 합 : "+even);
		
		*/
		
}
}