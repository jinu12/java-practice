import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
		// 2���� ������ �Է¹޾Ƽ� ù ��° �Է¹��� �ֿ��� ���� �� ��° �Է¹��� �� ������ ���� �߿���
		// Ȧ���� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		// ��, �� ��° �Է¹��� ���� ù ��° �Է¹��� ������ ���� ���
		// "�߸� �Է��ϼ̽��ϴ�."�� ����ϰ� �ڵ带 �����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է����ּ���: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���: ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if(num1 > num2) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}else {
			for(int i=num1;i<=num2;i++) {
				if(i%2 !=0 ) { //(i%2) ==1
					sum = sum + i; //sum += i;
				}
			}
		}
		
		sc.close();
		
		System.out.println("Ȧ���� �հ��" + sum +"�Դϴ�.");
	}

}
