import java.util.Scanner;

public class Sample3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�հ踦 ������ ����
		int sum = 0;
		//����� ������ ����
		double avg = 0;
		System.out.println(" ���� ������ ���� �Է��Ͻʽÿ�.");
		//������ ��
		int count = sc.nextInt();
		//�����ڵ��� ������ ������ ����
		int[] score = new int[count];
		
		System.out.println("���� �������� ����ŭ ������ �Է��� �ּ���.");
		
		for(int i=0;i<count;i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
			
		}
		
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "��° ����� ������" + score[i]+ " �Դϴ�.");
		}
		System.out.println("�հ� :" +sum);
		System.out.println("�հ� :" +sum/count);

		
	}

}
