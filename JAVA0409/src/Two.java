import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("정수 입력 :");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}
