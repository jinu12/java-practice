import java.util.Scanner;

public class Threes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("첫 번째 정수 입력 : ");
		Scanner sc = new Scanner(System.in);		
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력: ");
		int num2 = sc.nextInt();
		int sum=0;
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
				sum +=i;
			}
			System.out.println(num1+" ~"+num2 +"까지의 합계 :"+sum);
		}
		else {
			for(int i=num2;i<=num1;i++) {
				sum +=i;
			}
			System.out.println(num2+" ~"+num1 +"까지의 합계 :"+sum);
		}
		sc.close();
	}

}
