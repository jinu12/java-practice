import java.util.Scanner;

public class Sample3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//합계를 저장할 변수
		int sum = 0;
		//평균을 저장할 변수
		double avg = 0;
		System.out.println(" 시험 응시자 수를 입력하십시오.");
		//응시자 수
		int count = sc.nextInt();
		//응시자들의 점수를 저장할 공간
		int[] score = new int[count];
		
		System.out.println("시험 응시자의 수만큼 점수르 입력해 주세요.");
		
		for(int i=0;i<count;i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
			
		}
		
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "번째 사람의 점수는" + score[i]+ " 입니다.");
		}
		System.out.println("합계 :" +sum);
		System.out.println("합계 :" +sum/count);

		
	}

}
