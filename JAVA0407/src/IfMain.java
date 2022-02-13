import java.util.Scanner;

public class IfMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요. : ");
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		if(score >= 90) {
			if(score >=95) {
				System.out.println("A++");
			}else {
				System.out.println("A ");
			}
		// && 연산자의 경우에는 양쪽의 값이 모두 참이여야 참이다.
		}else if(score<90 && score >=85){
			System.out.println("B+");
		}
		// || 연산자의 경우에는 하나의 값이 참이여도 모두 참이다.
//		}else if(score<90 && score >=85){
//			System.out.println("B+");
//		}
		else if(score>=80){
			System.out.println("B");		
		}else if(score>=75){
			System.out.println("C+");		
		}else if(score>=70){
			System.out.println("C");		
		}else if(score>=60){
			System.out.println("D");		
		}
		//! 연산자는 결과를 반대값으로 변경한다. 참 -> 거짓, 거짓 -> 참
		else if(!(score>=60)) {
			System.out.println("Fail");
		}
		sc.close();

	}

}
