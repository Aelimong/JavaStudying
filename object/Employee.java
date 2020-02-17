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
   //접근지정자 private!!! 나중에 유효성 검사하기 좋음
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	//마우스 오른쪽-source-general getter & setter 자동으로 만들어줌
	
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
		return  "이름은 " + name + " 이고, " + dept + "에 근무하며, "
			     + "급여는 "+ pay + "원 입사성적은 " +  score + "점입니다";
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
