import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {
		
		System.out.println("���� ������� ���� ���ϰڽ��ϱ�?");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum =0;
		
		//while(���ǽ�)
		
		
		while(num>0) {
			sum += num;
			num--;
		}
		sc.close();
		
		System.out.println("1����" + num + "������ ����"+ sum + "�Դϴ�.");

	}

}
