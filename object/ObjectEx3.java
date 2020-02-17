package object;
/*setter &  getter : 멤버변수 하나당 하나씩 값을 대입하는 setter와
                                          그 값을 리턴하는 getter
*/

class Member{
	private String name; //외부(다른 클래스, 메인함수)에서 접근을 못함 
	private int age;
	private double tall;
	     // set + 멤버변수의 첫글자를 대문자로
	
	public void setName(String name) {  //리턴타입 보이드
		this.name=name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public void setTall(double tall) {
		this.tall=tall;
		
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getTall() {
		return tall;
	}
			
} 



public class ObjectEx3 {

	public static void main(String[] args) {
      
		Member ob=new Member();
        ob.setName("강호동");
        ob.setAge(25);
        ob.setTall(178.8);
        //여기서 name, age, tall 변수 쓸 수 없음 private 이기 따문에
		
		System.out.println("이름 : "+ob.getName());
		System.out.println("나이 : "+ob.getAge());
		System.out.println("신장 : "+ob.getTall());
		
	}

}
