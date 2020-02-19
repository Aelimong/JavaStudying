package whileex;
//while문

public class WhileEx1 {

	public static void main(String[] args) {
         
		//10 9 8 7 6 5 4 3 2 1
	/*
	 int n=10;
	 while(true) {
            
		 System.out.print(n+" ");
		 n--;
		 if(n==0)
		 break;
	 }
	*/	
	 
	 int n=10; //변수=난수생성
	 while(n>0) {
		 System.out.print(n+" ");
		 n--;
	 }
	
	 
		
     /*
		
		int n=0;
		while(n<10 ) {
			++n;	
		System.out.println("hello java");
			
			
		}
		
		
		
		/*
		int n=0; //0으로 초기화 왜 하는거지
          while(true)   //while(true or false){}
          {
        	 
        	  
        	  ++n;
        	  if(n<=5) {
        		  System.out.println("hello java");
        	  } else {
        		  break;
        	  }
        	  
          }
		*/
		
		
	}

}
