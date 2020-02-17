package object;
/*setter &  getter : ������� �ϳ��� �ϳ��� ���� �����ϴ� setter��
                                          �� ���� �����ϴ� getter
*/

class Member{
	private String name; //�ܺ�(�ٸ� Ŭ����, �����Լ�)���� ������ ���� 
	private int age;
	private double tall;
	     // set + ��������� ù���ڸ� �빮�ڷ�
	
	public void setName(String name) {  //����Ÿ�� ���̵�
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
        ob.setName("��ȣ��");
        ob.setAge(25);
        ob.setTall(178.8);
        //���⼭ name, age, tall ���� �� �� ���� private �̱� ������
		
		System.out.println("�̸� : "+ob.getName());
		System.out.println("���� : "+ob.getAge());
		System.out.println("���� : "+ob.getTall());
		
	}

}
