import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아서 첫 번째 입력받은 주에서 부터 두 번째 입력받은 수 까지의 정수 중에서
		// 홀수의 합을 출력하는 코드를 작성하시오.
		// 단, 두 번째 입력받은 값이 첫 번째 입력받은 값보다 적을 경우
		// "잘못 입력하셨습니다."를 출력하고 코드를 종료하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if(num1 > num2) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			for(int i=num1;i<=num2;i++) {
				if(i%2 !=0 ) { //(i%2) ==1
					sum = sum + i; //sum += i;
				}
			}
		}
		
		sc.close();
		
		System.out.println("홀수의 합계는" + sum +"입니다.");
	}

}
