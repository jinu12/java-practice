import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ��° �ݺ��� ���������ðڽ��ϱ�?");
		
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + "��° �ݺ��Դϴ�.");
			if(i==num) {
				break;
			}
		}
		
		sc.close();
		
		
	}
}
