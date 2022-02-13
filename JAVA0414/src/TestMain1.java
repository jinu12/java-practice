import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {
		/*
		 * 학급의 학생 수를 입력받고, 그 입력받은 학생 수 만큼 점수를 입력받아서 
		 * 총점과 평균 그리고 최고점수를 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학급의 학생 수를 입력하시오.");
		int count = sc.nextInt();
		int[] score = new int[count];
		int sum=0;
		double avg=0;
		int max=0;
		
		
		System.out.println("학생 수 만큼 점수를 입력해주세요.");
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

		
		System.out.println("합계 : " + sum);
		System.out.println("평군 : " + avg);
		System.out.println("최고 : " + max);

	}

}
