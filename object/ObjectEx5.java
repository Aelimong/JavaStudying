package object;

/*
 * 클래스명 : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * 
 * +getter & setter 
 * 
 * +toString(): String ===>출력문장 만들기
 * +getPrice() :int    ===>수향 * 단가를 리턴
 *
 * --결과
 * 품목 : apple
 * 수량 : 5
 * 단가 : 1200
 * 금액 : 6000원
 * 
 * apple   1200원짜리 5개 구입하려면 6000원이 필요함 ===>main에서 충역 getter 이용
 *
 *
 */

class Sales {

  private String item;
  private int qty;
  private int cost;


public void setItem(String item) {
	this.item = item;
}
public void setQty(int qty) {
	this.qty = qty;
}
public void setCost(int cost) {
	this.cost = cost;
}
  
  
public String getItem() {
	return item;
}
public int getQty() {
	return qty;
}
public int getCost() {
	return cost;
}
  
public int getPrice() {
	return cost*qty;  
}
@Override
public String toString() {
	return item+" "+cost+"원 짜리 "+qty+"개 구입하려면 "
           +getPrice()+"원이 필요함";
}
 

}


public class ObjectEx5 {

	public static void main(String[] args) {

		Sales ob=new Sales();
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		System.out.println("품목 : "+ob.getItem());
		System.out.println("수량 : "+ob.getQty());
		System.out.println("단가 : "+ob.getCost());
		System.out.println("금액 : "+ob.getPrice());
		
		
		System.out.println(ob.toString());
		
	}

}



