package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �������� �Է��ϼ��� : 5
 * 
 * ���� ���� : 78.5 <==(��*��*3.14)
 * ���� �ѷ� : 31.4 <==(2*3.14*��)
 * 
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		
		int r;
//		double size;
		double rnd;
		
		System.out.print("�������� �Է��ϼ��� : ");
		r=Integer.parseInt(br.readLine());
		
		double size=3.14*r*r;
		rnd=2*3.14*r;
		
		System.out.printf("���� ���� : %.1f\n", size);
		System.out.printf("���� �ѷ� : %.1f\n", rnd);
	}

}






















