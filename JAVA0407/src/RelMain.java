import java.util.Scanner;

public class RelMain {

	public static void main(String[] args) {
		boolean b1 = 3 < 5;
		boolean b2 = 3 > 5;
		boolean b3 = 3 == 5;
		boolean b4 = 3 != 5;
		
		System.out.println(b1); //control + art 방향키
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
//		if(조건식) {
//			//조건이 참일때 진행할 식
//		}
		//조건식 = 결과가 참 또는 거짓으로 나오는 구문
		if(b1) {
			System.out.println("조건이 참일때 실행할 구문");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요. : ");
		
		int score = sc.nextInt();
		
		if(score >=80) {
			System.out.println("여행을 떠난다.");
		} else {
			
		}
		if(score >=80) {
			System.out.println("학점이 B이상 입니다..");
		} else {
			System.out.println("학점이 B미만 입니다.");
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}
