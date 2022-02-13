import java.util.Scanner;

public class TsetMain2 {

	public static void main(String[] args) {
		// 사용자에게 정수를 1개 입력받아서 홀수인지 짝수인지 구별하여 출력하시오
		System.out.println("값을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 % 2 ==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		if((num1%3 ==0) && (num1%5==0)) { 
			System.out.println("3의 배수이면서 5의 배수 입니다.");
		}
		sc.close();

	}

}
