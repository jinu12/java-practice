import java.util.Scanner;

public class SwitchMain {

	public static void main(String[] args) {
		
		System.out.println("���� �Է��Ͻÿ�. : ");
		
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
			System.out.println("31��");
			break;
		case 2:
			System.out.println("28��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		default:
			System.out.println("���� �߸��߽��ϴ�.");
			break;
		}
		sc.close();
		
		
//		int num =3;
//		char c = '��';

//		//�� , ����, ����, ���ڿ�(Java7�����̻�)
//		switch (num) {
//			case 1:
//				System.out.println("1�Դϴ�.");
//				break;
//			case 2:
//				System.out.println("2�Դϴ�.");
//				break;
//			case 3:
//				System.out.println("3�Դϴ�.");
//				break;
//			default:
//				System.out.println("�� ���� �����Դϴ�..");
//				break;
//			}
//		switch (c) {
//		case '��':
//			System.out.println("1�Դϴ�.");
//			break;
//		case '��':
//			System.out.println("2�Դϴ�.");
//			break;
//		case '��':
//			System.out.println("3�Դϴ�.");
//			break;
//		default:
//			System.out.println("�� ���� �����Դϴ�..");
//			break;
//		}
		

	}

}
