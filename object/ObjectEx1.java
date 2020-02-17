package object;
/*
*   -(private)  + (public)  #(protected)
* 
* Ŭ������ : Person
* +name:String
* +age:int
* +score:float
* +setPerson(name :String, a:int, s:float) :void   --> ��ȣ�� �ڿ� �ٴ°� �Լ���� ���
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
		//set�� ���� ���� ���Խ��� �ִ°�!!!!
		//this.~ �ڱ� �ڽ� ��ü�� �̸�
	}
	
	public void viewPerson() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+score);
	
	}
	
}

public class ObjectEx1 {

	public static void main(String[] args) {
     Person ps=new Person();              //new Person : �� ������ �޸𸮸� �Ҵ��ϴ� �ν��Ͻ�
     ps.setPerson("������", 23, 73.5f);    //ps : ��ü(�ʵ�� �޼����� ����
     ps.viewPerson();
     System.out.println(ps.hashCode()); //hash :�������� �ν��Ͻ��� ���� �������� �ִ� ���
     
     /*
     
     
     ps=new Person();              
     ps.setPerson("�ε鷹", 25, 90.5f);   
     ps.viewPerson();
     System.out.println(ps.hashCode());
     
     */
     
     
	}

}