import java.util.Scanner;

public class TsetMain2 {

	public static void main(String[] args) {
		// ����ڿ��� ������ 1�� �Է¹޾Ƽ� Ȧ������ ¦������ �����Ͽ� ����Ͻÿ�
		System.out.println("���� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 % 2 ==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		if((num1%3 ==0) && (num1%5==0)) { 
			System.out.println("3�� ����̸鼭 5�� ��� �Դϴ�.");
		}
		sc.close();

	}

}
