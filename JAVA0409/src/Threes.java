import java.util.Scanner;

public class Threes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ù ��° ���� �Է� : ");
		Scanner sc = new Scanner(System.in);		
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		int num2 = sc.nextInt();
		int sum=0;
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
				sum +=i;
			}
			System.out.println(num1+" ~"+num2 +"������ �հ� :"+sum);
		}
		else {
			for(int i=num2;i<=num1;i++) {
				sum +=i;
			}
			System.out.println(num2+" ~"+num1 +"������ �հ� :"+sum);
		}
		sc.close();
	}

}
