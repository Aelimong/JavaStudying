package object;
/* -base : int
 * -top : int
 * -height : int
 * 
 * +setTrapezoid (base:int, top:int, height:int) void
 * +calc(): double   <---»ç´Ù¸®²ÃÀÇ ³ÐÀÌ ±¸ÇØ¼­ ¸®ÅÏ (¾Æ·§º¯+À­º¯)*³ôÀÌ/2.0
 * +toString() :String
 *
 */


public class Trapezoid {

	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
	  this.base=base;
	  this.top=top;
	  this.height=height;
	
	}
	
	public double calc() {
		return (base+top)*height/2.0;
	}

	@Override
	public String toString() {
		return "³ÐÀÌ : "+calc();
	}
	
	
	
	
}
