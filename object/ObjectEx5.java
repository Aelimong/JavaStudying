package object;

/*
 * Ŭ������ : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * 
 * +getter & setter 
 * 
 * +toString(): String ===>��¹��� �����
 * +getPrice() :int    ===>���� * �ܰ��� ����
 *
 * --���
 * ǰ�� : apple
 * ���� : 5
 * �ܰ� : 1200
 * �ݾ� : 6000��
 * 
 * apple   1200��¥�� 5�� �����Ϸ��� 6000���� �ʿ��� ===>main���� �濪 getter �̿�
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
	return item+" "+cost+"�� ¥�� "+qty+"�� �����Ϸ��� "
           +getPrice()+"���� �ʿ���";
}
 

}


public class ObjectEx5 {

	public static void main(String[] args) {

		Sales ob=new Sales();
		ob.setItem("apple");
		ob.setQty(5);
		ob.setCost(1200);
		
		System.out.println("ǰ�� : "+ob.getItem());
		System.out.println("���� : "+ob.getQty());
		System.out.println("�ܰ� : "+ob.getCost());
		System.out.println("�ݾ� : "+ob.getPrice());
		
		
		System.out.println(ob.toString());
		
	}

}



