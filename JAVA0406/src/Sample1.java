import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.print("��ȭ�� ���̸� �����ÿ� : ");
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println("��ȭ�� ���̴� "+age +"�� �Դϴ�.");

	}

}
