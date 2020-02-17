package object;
/*
*   -(private)  + (public)  #(protected)
* 
* 클래스명 : Person
* +name:String
* +age:int
* +score:float
* +setPerson(name :String, a:int, s:float) :void   --> 괄호가 뒤에 붙는건 함수라는 얘기
* +viewPerson():void
*/

class Person{
	
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {
		this.name=name;
		this.age=age;
		this.score=score;
		//set이 들어가면 무언가 대입시켜 주는것!!!!
		//this.~ 자기 자신 객체의 이름
	}
	
	public void viewPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
	
	}
	
}

public class ObjectEx1 {

	public static void main(String[] args) {
     Person ps=new Person();              //new Person : 힙 영역에 메모리를 할당하는 인스턴스
     ps.setPerson("개나리", 23, 73.5f);    //ps : 객체(필드와 메서드의 조합
     ps.viewPerson();
     System.out.println(ps.hashCode()); //hash :힙영역의 인스턴스에 대한 참조값을 주는 방식
     
     /*
     
     
     ps=new Person();              
     ps.setPerson("민들레", 25, 90.5f);   
     ps.viewPerson();
     System.out.println(ps.hashCode());
     
     */
     
     
	}

}