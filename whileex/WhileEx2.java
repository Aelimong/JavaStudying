package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*단을 입력받아 구구단을 출력하세요
 * 
 * --결과
 * 단을 입력하세요 : 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 
 */


public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
        int num;
        System.out.print("단을 입력하세요 : ");
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
