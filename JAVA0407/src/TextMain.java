import java.util.Scanner;

public class TextMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목 1~5의 점수를 정수로 입력하시오.");
		
		/*
		 * int sum = 0;
		 * 
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * 
		 */
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();		
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int sum = num1 + num2 +num3 +num4 +num5;
		double avg = (double)sum / 5.00;
		
		System.out.println("5과목의 합계는" + sum + "점입니다.");
		System.out.println("5과목의 퍙군은" + avg + "점입니다.");
		sc.close();
		
	}

}
