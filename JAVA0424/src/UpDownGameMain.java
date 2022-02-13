import java.util.Scanner;

public class UpDownGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1 ~ 50 사이의 랜덤한 숫자
		// Math.Random() 0.0 <= x <  1
		// 0.000000000000000000 ~0.999999999999999999
		int randomnum = (int)(Math.random()*50) +1;
		
		int count = 0;
		
		System.out.println("몇번의 기회를 줄것인지 입력하세요 : ");
		
		int chance = sc.nextInt();
		
		while(true) {
			System.out.println((count+1) + " 숫자를 입력하세요: ");
			int number = sc.nextInt();
			
			if(number > 50 || number <1) {
				System.out.println("1~50 사이에 숫자를 입력하셔야 합니다.");
				continue;
			}
			
			int[] array = new int[chance];
			
			
			if(randomnum > number) {
				System.out.println("up");
			}else if(randomnum < number) {
				System.out.println("Down");
			}else {
				System.out.println("정답입니다.");
				
				for(int i=0;i<count;i++) {
					System.out.println((i+1) + "번째 숫자: "+array[i]);
				}
				break;
			}
			
			count++;
			
			if(count >= chance) {
				System.out.println("기회를 전부 사용하셨습니다.");
				break;
			}
		}

	}

}
