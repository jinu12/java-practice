import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하시오.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		if(num1 == num2) {
//			System.out.println("두 숫자는 같습니다.");
//		}else if(num1<num2) {
//			System.out.println(num1+"보다"+ num2+"가 큽니다.");
//		}else {
//			System.out.println(num2+"보다"+ num1+"가 큽니다.");
//		}
//		조건식 ? 참 : 거짓 ;
		String str = num1 > num2 ? num1 +"보다" + num2 + "큽니다."  : num2 + "보다"+ num1 + "큽니다.";
		System.out.println(str);
		sc.close();
	}

}
