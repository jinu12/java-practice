import java.util.Scanner;

public class TextMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 1~5�� ������ ������ �Է��Ͻÿ�.");
		
		/*
		 * int sum = 0;
		 * 
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * sum+= sc.nextInt();
		 * 
		 */
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();		
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int sum = num1 + num2 +num3 +num4 +num5;
		double avg = (double)sum / 5.00;
		
		System.out.println("5������ �հ��" + sum + "���Դϴ�.");
		System.out.println("5������ ������" + avg + "���Դϴ�.");
		sc.close();
		
	}

}
