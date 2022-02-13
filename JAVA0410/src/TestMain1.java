import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {
		
		//함수 하나를 입력 받아서 입력받은 정수의 팩토리얼을 계싼하여 출력하는 코드를 작성하시오.
		
		// 정수 : 5 -> 5*4*3*2*1
		
		System.out.println("정수를 입력해주세요: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int pack = 1;
		
		for(int i=num;i>0;i--) {
			
			System.out.print(i +"*");
			pack = pack *i; //pack *= i;
			
		}
		System.out.println("");
		System.out.print( "결과 :" + pack);
		
//		int i = num;
//		while(i>0) {
//			i--;
//		}
		
		sc.close();

	}

}
