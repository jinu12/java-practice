import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		
		System.out.println("월을 입력하시오. : ");
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		default:
			System.out.println("값을 잘못했습니다.");
			break;
		}
		sc.close();
		
		
//		int num =3;
//		char c = '가';

//		//값 , 숫자, 문자, 문자열(Java7버전이상)
//		switch (num) {
//			case 1:
//				System.out.println("1입니다.");
//				break;
//			case 2:
//				System.out.println("2입니다.");
//				break;
//			case 3:
//				System.out.println("3입니다.");
//				break;
//			default:
//				System.out.println("그 밖의 숫자입니다..");
//				break;
//			}
//		switch (c) {
//		case '가':
//			System.out.println("1입니다.");
//			break;
//		case '나':
//			System.out.println("2입니다.");
//			break;
//		case '다':
//			System.out.println("3입니다.");
//			break;
//		default:
//			System.out.println("그 밖의 숫자입니다..");
//			break;
//		}
		

	}

}
