package algorithm;

import java.util.Scanner;

public class RefacotringGuGu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		   System.out.println("====== ======\\");
		   System.out.println("====== 1주차 과제 결과 ======");
		   System.out.print("=============================\n");
		   while (true) {
			  System.out.print("몇단까지 출력할까요(2~9단, 나머지 정수 값 입력시 종료됨)\n");
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
		         System.out.print("이용해 주셔서 감사합니다.\n");
		         System.out.print("개발자 : ");
		         break;
		      }
		   }
		   sc.close();

		
	}

}
