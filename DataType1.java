package step01_기초;

public class DataType1 {

	public static void main(String[] args) {
		String name = "홀길동"; // 문자열 자료형
		int age = 23; // 4바이트 정수 자료형 +2147483647 ~ -2147483648
		char gender = '남'; // 문자 1개는 ''안에 사용
		float weight = 63.4f; // 4바이트 실수 자료형
		double tall = 175.5; // 8바이트 실수 자료형

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender + "자");
		System.out.println("체중 : " + weight + "kg");
		System.out.println("신장 : " + tall + "cm");

	}

}
/*
 * 범위지정 주석지정 Ctrl + Shift + / 주석 해제 Ctrl + Shift + \ 인덴테이션 Ctrl + Shift + F
 */
