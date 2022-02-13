import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.print("귀화의 나이를 적으시오 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println("귀화의 나이는 "+age +"세 입니다.");

	}

}
