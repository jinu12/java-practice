package algorithm;

import java.util.Scanner;

public class RefacotringGuGu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		   System.out.println("====== ======\\");
		   System.out.println("====== 1���� ���� ��� ======");
		   System.out.print("=============================\n");
		   while (true) {
			  System.out.print("��ܱ��� ����ұ��(2~9��, ������ ���� �� �Է½� �����)\n");
			  System.out.print(">>");
			  dan = sc.nextInt();
		      if (dan != 0 && dan != 1 && dan != 10) {

		         if (dan < 5) {
		            for (int i = 1; i < 10; i++) {

		               for (int j = 2; j <= dan; j++) {
		            	   System.out.printf("%3d X %d = %2d   ", j, i, j *i);
		               }
		               System.out.print("\n");

		            }
		         }
		         else {
		            for (int i = 1; i < 10; i++) {

		               for (int j = 2; j <= 5; j++) {
		                  System.out.printf("%3d X %d = %2d   ", j, i, j *i);
		               }
		               System.out.print("\n");

		            }
		            System.out.print("\n");
		            for (int i = 1; i < 10; i++) {
		               for (int j = 6; j <= dan; j++) {
		            	   System.out.printf("%3d X %d = %2d   ", j, i, j *i);
		               }
		               System.out.print("\n");
		            }

		         }
		      }


		      else {
		         System.out.print("�̿��� �ּż� �����մϴ�.\n");
		         System.out.print("������ : ");
		         break;
		      }
		   }
		   sc.close();

		
	}

}
