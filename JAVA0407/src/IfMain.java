import java.util.Scanner;

public class IfMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���. : ");
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		if(score >= 90) {
			if(score >=95) {
				System.out.println("A++");
			}else {
				System.out.println("A ");
			}
		// && �������� ��쿡�� ������ ���� ��� ���̿��� ���̴�.
		}else if(score<90 && score >=85){
			System.out.println("B+");
		}
		// || �������� ��쿡�� �ϳ��� ���� ���̿��� ��� ���̴�.
//		}else if(score<90 && score >=85){
//			System.out.println("B+");
//		}
		else if(score>=80){
			System.out.println("B");		
		}else if(score>=75){
			System.out.println("C+");		
		}else if(score>=70){
			System.out.println("C");		
		}else if(score>=60){
			System.out.println("D");		
		}
		//! �����ڴ� ����� �ݴ밪���� �����Ѵ�. �� -> ����, ���� -> ��
		else if(!(score>=60)) {
			System.out.println("Fail");
		}
		sc.close();

	}

}
