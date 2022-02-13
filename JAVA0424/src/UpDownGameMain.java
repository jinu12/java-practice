import java.util.Scanner;

public class UpDownGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1 ~ 50 ������ ������ ����
		// Math.Random() 0.0 <= x <  1
		// 0.000000000000000000 ~0.999999999999999999
		int randomnum = (int)(Math.random()*50) +1;
		
		int count = 0;
		
		System.out.println("����� ��ȸ�� �ٰ����� �Է��ϼ��� : ");
		
		int chance = sc.nextInt();
		
		while(true) {
			System.out.println((count+1) + " ���ڸ� �Է��ϼ���: ");
			int number = sc.nextInt();
			
			if(number > 50 || number <1) {
				System.out.println("1~50 ���̿� ���ڸ� �Է��ϼž� �մϴ�.");
				continue;
			}
			
			int[] array = new int[chance];
			
			
			if(randomnum > number) {
				System.out.println("up");
			}else if(randomnum < number) {
				System.out.println("Down");
			}else {
				System.out.println("�����Դϴ�.");
				
				for(int i=0;i<count;i++) {
					System.out.println((i+1) + "��° ����: "+array[i]);
				}
				break;
			}
			
			count++;
			
			if(count >= chance) {
				System.out.println("��ȸ�� ���� ����ϼ̽��ϴ�.");
				break;
			}
		}

	}

}
