package forex;

public class ForEx2 {

	public static void main(String[] args) {
     
		/*
		 //continue, break;
		
		for(int a=1; a<=10; a++) {
			if(a==5) {
                  continue; //���� �ϴ� ���� ���߰� ������ �� ó������ ���ư�
                  //break;
			}
		System.out.print(a+" ");
		}
		
		
		
		//�迭 : ������ �ڷ����� ���ӵ� ������
		int [] num = {101, 102, 103, 104, 105}; // �迭����
		for(int i=0; i<num.length; i++) {  
	              //�Ϻκи� ����ϰ� �ɶ�
			System.out.print(num[i]+" ");
			}
		*/
		
		
		/*
1. ���� for�� (������)
        for(int n : num) {
        	//������ ������ , :ó������ ������ ��ȸ
        	System.out.println(n);
	     }
    
     */
		
// 2. ���� for�� (������)
        
        String[] color= {"red", "green", "blu"};
        
        for(int i=0; i<color.length; i++) {
        System.out.print(color[i]+" ");	
        }
          
        for(String n : color) {
        	System.out.print(n+" ");	
        }
           
        
}
}