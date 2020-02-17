package overload;
/*
 * 오버로드 메서드 overload method  (중복함수)
 * : 같은 이름의 함수를 여러번 구현
 *  오버로딩 --->매개변수를 달리하는 생성자를 여러개 선언하는 것
 *1.반드시 함수이름이 동일
 *2.매개변수의 타입이 다르거나 개수가 달라야함
 *
 */
public class OverloadEx {
	//public이나 private 안 쓰면 '디폴트 접근지정자' 
 int x=17;	//전역변수
 int y=15;
 
 public int max() {
	 return (x>y)?x:y;
 }

 public int max(int x, int y) {
	 return (x>y)?x:y;
 
 }
 
 public float max(float x, float y) {
	 return (x>y)?x:y;
 }
 
	public static void main(String[] args) {

	OverloadEx ob=new OverloadEx();
	System.out.println("큰 수 : "+ob.max());
	System.out.println("큰 수 : "+ob.max(75,100));
	System.out.println("큰 수 : "+ob.max(75.5f,100.4f));
		
		
	}

}
