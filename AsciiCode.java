package step02_������;
/* 7��Ʈ  ������ȯ�� �ڵ� 2^7 ���� �ڷ�ǥ�� 
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

















