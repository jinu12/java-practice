import java.util.Scanner;

public class RelMain {

	public static void main(String[] args) {
		boolean b1 = 3 < 5;
		boolean b2 = 3 > 5;
		boolean b3 = 3 == 5;
		boolean b4 = 3 != 5;
		
		System.out.println(b1); //control + art ����Ű
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
//		if(���ǽ�) {
//			//������ ���϶� ������ ��
//		}
		//���ǽ� = ����� �� �Ǵ� �������� ������ ����
		if(b1) {
			System.out.println("������ ���϶� ������ ����");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���. : ");
		
		int score = sc.nextInt();
		
		if(score >=80) {
			System.out.println("������ ������.");
		} else {
			
		}
		if(score >=80) {
			System.out.println("������ B�̻� �Դϴ�..");
		} else {
			System.out.println("������ B�̸� �Դϴ�.");
		}
		sc.close();
		System.out.println("���α׷� ����");
		
	}

}
