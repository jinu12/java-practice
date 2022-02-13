import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 번째 반복을 빠져나가시겠습니까?");
		
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + "번째 반복입니다.");
			if(i==num) {
				break;
			}
		}
		
		sc.close();
		
		
	}
}
