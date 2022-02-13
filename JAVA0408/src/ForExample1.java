import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하시오.");
//		for(int i = 1;i<4;i++) {
//			System.out.println("ㅑ값: " +i);
//		}
//
//		for(int i=4;i>1;i--) {
//			System.out.println("ㅑ값: " +i);
//		}
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print("*");
		}
		sc.close();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.println("1부터 "+num+"까지 더한 값은"+sum+"입니다.");
	}

}
