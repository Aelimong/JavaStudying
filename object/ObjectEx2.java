package object;

public class ObjectEx2 {

	public static void main(String[] args) {

		User ob=new User();  //내가 사용하고자 하는 함수가 있는 클래스로 객체를 만들어주는  것
		ob.setUser("진달래", 97, 55, 79); //1 객체공간 만들기
	    
		System.out.println(ob.getUser());
		
		
	}

	//이름은 진달래이고, 총점은 231점입니다.
	
	
}
