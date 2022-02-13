import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {
		
		System.out.println("숫자 몇까지의 합을 구하겠습니까?");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum =0;
		
		//while(조건식)
		
		
		while(num>0) {
			sum += num;
			num--;
		}
		sc.close();
		
		System.out.println("1부터" + num + "까지의 합은"+ sum + "입니다.");

	}

}
