import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int count=0;
		int[] score = null;


	while(run) {
		System.out.println("====================================");
		System.out.println("1.�л� ��|2.�����Է� |3.��������Ʈ|4.�м�|5.����");
		System.out.println("====================================");
		System.out.println("���� > ");
		int menu = sc.nextInt();
			switch (menu) {
				case 1: 
					System.out.print("�л� �� >");
					count = sc.nextInt();
					score = new int[count];
					System.out.println("�л����� "+count+"�Դϴ�.");
					break;
				case 2:
					System.out.print("�л����� �°� ������ �Է� ���ּ���>");
					for(int i=0;i<score.length;i++) {
						System.out.println("score[" + (i+1) + "] > ");
						score[i] = sc.nextInt();
					}

					break;
				case 3:
					for(int i=0;i<score.length;i++) {
						System.out.println("score[" + (i+1) + "] > " + score[i]);
					}
					break;
				case 4:
					int sum =0;
					int max=0;
					double avg =0.0;
					
					for(int i=0;i<score.length;i++) {
						sum += score[i];
						max = (max < score[i]) ? score[i]: max; 
					}
					
					avg = (double)sum/ score.length;
					System.out.println("�հ� : " + sum);
					System.out.println("�� : " + avg);
					System.out.println("�ְ� : " + max);
					break;
				case 5:
					run =false;
					break;
		
				default:
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
			}
					
		}
		sc.close();
	}

}
