import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {
		/*
		 * �б��� �л� ���� �Է¹ް�, �� �Է¹��� �л� �� ��ŭ ������ �Է¹޾Ƽ� 
		 * ������ ��� �׸��� �ְ������� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�б��� �л� ���� �Է��Ͻÿ�.");
		int count = sc.nextInt();
		int[] score = new int[count];
		int sum=0;
		double avg=0;
		int max=0;
		
		
		System.out.println("�л� �� ��ŭ ������ �Է����ּ���.");
		for(int i=0;i<score.length;i++) {
			score[i] = sc.nextInt();
			sum += score[i];
			if(i==0) {
				max = score[0];
			}else {
				if(max<score[i]) {
					max =score[i];
				}
			}
		}
		sc.close();
		
		avg = (double)sum/ score.length;

		
		System.out.println("�հ� : " + sum);
		System.out.println("�� : " + avg);
		System.out.println("�ְ� : " + max);

	}

}
