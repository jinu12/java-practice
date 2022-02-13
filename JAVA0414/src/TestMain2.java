import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int count=0;
		int[] score = null;


	while(run) {
		System.out.println("====================================");
		System.out.println("1.학생 수|2.점수입력 |3.점수리스트|4.분석|5.종료");
		System.out.println("====================================");
		System.out.println("선택 > ");
		int menu = sc.nextInt();
			switch (menu) {
				case 1: 
					System.out.print("학생 수 >");
					count = sc.nextInt();
					score = new int[count];
					System.out.println("학생수는 "+count+"입니다.");
					break;
				case 2:
					System.out.print("학생수에 맞게 점수를 입력 해주세요>");
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
					System.out.println("합계 : " + sum);
					System.out.println("평군 : " + avg);
					System.out.println("최고 : " + max);
					break;
				case 5:
					run =false;
					break;
		
				default:
					System.out.println("잘못입력하셨습니다.");
					break;
			}
					
		}
		sc.close();
	}

}
