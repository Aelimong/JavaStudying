package object;

/* -name:String
 * -dept:String
 * -pay:int
 * -score:double
 *
 * +setName(name:String) : void
 * +setDept(dept:String) : void
 * +setPay(pay:int) : void
 * +setScore(score:double) : void
 *
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 *
 */


public class Employee {
   //���������� private!!! ���߿� ��ȿ�� �˻��ϱ� ����
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	//���콺 ������-source-general getter & setter �ڵ����� �������
	
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
		
		
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return  "�̸��� " + name + " �̰�, " + dept + "�� �ٹ��ϸ�, "
			     + "�޿��� "+ pay + "�� �Ի缺���� " +  score + "���Դϴ�";
	}
	
	
  public void setEmployee(String name, String dept, int pay, double score) {
	  this.name=name;
      this.dept=dept;
      this.pay=pay;
      this.score=score;
      
  
  }
	
	

	
	
	
	
	/*
	public void setName(String name) {
	     this.name=name;	
	}
	public void setDept(String dept) {
	     this.dept=dept;	
	}
	public void setPay(int pay) {
	     this.pay=pay;	
	}
	public void setScore(double score) {
	     this.score=score;	
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getPay() {
		return pay;
	}
	public double getScore() {
		return score;
	}
	
	*/
	
	
	
}
