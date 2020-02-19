package forex;

public class ForEx2 {

	public static void main(String[] args) {
     
		/*
		 //continue, break;
		
		for(int a=1; a<=10; a++) {
			if(a==5) {
                  continue; //현재 하던 일을 멈추고 루프의 맨 처음으로 돌아감
                  //break;
			}
		System.out.print(a+" ");
		}
		
		
		
		//배열 : 동일한 자료형의 연속된 기억공간
		int [] num = {101, 102, 103, 104, 105}; // 배열선언
		for(int i=0; i<num.length; i++) {  
	              //일부분만 사용하게 될때
			System.out.print(num[i]+" ");
			}
		*/
		
		
		/*
1. 향상된 for문 (정수형)
        for(int n : num) {
        	//임의의 기억공간 , :처음부터 끝까지 순회
        	System.out.println(n);
	     }
    
     */
		
// 2. 향상된 for문 (문자형)
        
        String[] color= {"red", "green", "blu"};
        
        for(int i=0; i<color.length; i++) {
        System.out.print(color[i]+" ");	
        }
          
        for(String n : color) {
        	System.out.print(n+" ");	
        }
           
        
}
}