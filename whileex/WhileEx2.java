package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*���� �Է¹޾� �������� ����ϼ���
 * 
 * --���
 * ���� �Է��ϼ��� : 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 
 */


public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        int num;
        System.out.print("���� �Է��ϼ��� : ");
		num=Integer.parseInt(br.readLine());
        
		int n=1; 
			while(true) {
				
			System.out.println(num+"*"+n+"="+num*n);
				++n;
				if(n==10)
					break;
		}
			
		/*while(n<=9) {
	      System.out.println(num+"*"+n+"="+num*n);
	      ++n;
	       }
		*/
		
	}

}
