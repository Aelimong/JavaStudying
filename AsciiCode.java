package step02_연산자;
/* 7비트  정보교환용 코드 2^7 개의 자료표현 
 * A : 65,  a : 97  \n : 13
 */
public class AsciiCode {

	public static void main(String[] args) {
		System.out.println("A : "+ (int)'A');
		System.out.println("a : "+ (int)'a');
		
		System.out.println(65 +" : "+(char)65);
		System.out.println(97 +" : "+(char)97);
		
		System.out.println("------------------------");
		
		System.out.println('A'+1);  //char + int =int
		System.out.println((char)('A'+1));
		
		System.out.println('a'-32);
		System.out.println((char)('a'-32));
		
		System.out.println('A'+'B'); //char+char=int
		

	}

}


















