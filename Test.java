package step01_기초;


/*
 * 각각 변수에 대입하여 출력 하세요
 * 
 * ---결과
 * 이름 : 이순신     <--println()
 * 나이 : 25세    <--print()
 * 부서 : 개발부
 * 성적 : 87.5점   <--printf()
 * */

public class Test {

	public static void main(String[] args) {
         String name="이순신";
         int age=25;
         String team="개발부";
         float score=87.5f;
         
         System.out.println("이름 : "+name+"");
         System.out.print("나이 : "+age+"세\n");
         System.out.printf("부서: %s\n성적: %-1.1f점\n", team, score);
         

	}

}
