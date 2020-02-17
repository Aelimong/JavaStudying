package object;
/*  -(private)  +(public)  # (protected)
 * +name: String
 * +k:int
 * +e:int
 * +m:int
 * 
 * +setUser(name :String, k:int, e:int, m:int) :void  
 * +getTotal() :int
 * +getUser() :String //겟유저는 겟토탈호출
 * 
 */

public class User {
	
	//2변수대입
	
	public String name;
	public int k;
	public int e;
	public int m;

	
	//3함수들 만들기
	public void setUser(String n, int kor, int eng, int mat ) {	
	 	name=n;      
		k=kor;
		e=eng;
		m=mat;	
	}

	public int getTotal() {
		return k+e+m; //겟토탈은 정수형이 나와야함
	}                 //함수를 만들었다고 반드시 사용할 필요는 없음. 메인함수에 꼭 호출할 필요 없다는 말
	
	public String getUser() {
		return "이름은 "+name+"이고, "+"총점은"+getTotal()+"점입니다";
}
}
