package object;
/*  -(private)  +(public)  # (protected)
 * +name: String
 * +k:int
 * +e:int
 * +m:int
 * 
 * +setUser(name :String, k:int, e:int, m:int) :void  
 * +getTotal() :int
 * +getUser() :String //�������� ����Żȣ��
 * 
 */

public class User {
	
	//2��������
	
	public String name;
	public int k;
	public int e;
	public int m;

	
	//3�Լ��� �����
	public void setUser(String n, int kor, int eng, int mat ) {	
	 	name=n;      
		k=kor;
		e=eng;
		m=mat;	
	}

	public int getTotal() {
		return k+e+m; //����Ż�� �������� ���;���
	}                 //�Լ��� ������ٰ� �ݵ�� ����� �ʿ�� ����. �����Լ��� �� ȣ���� �ʿ� ���ٴ� ��
	
	public String getUser() {
		return "�̸��� "+name+"�̰�, "+"������"+getTotal()+"���Դϴ�";
}
}
