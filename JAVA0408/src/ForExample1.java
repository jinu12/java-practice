import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		for(int i = 1;i<4;i++) {
//			System.out.println("����: " +i);
//		}
//
//		for(int i=4;i>1;i--) {
//			System.out.println("����: " +i);
//		}
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.print("*");
		}
		sc.close();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		System.out.println("1���� "+num+"���� ���� ����"+sum+"�Դϴ�.");
	}

}
