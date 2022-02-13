import java.util.Scanner;

public class MainTypeText {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하고 싶은 숫자를 입력하시오 :");
		
		int number = sc.nextInt();
		
		sc.close();
		
		System.out.println("입력하고 싶은 숫자는 "+ number +" 입니다 ");
		

	}

}
