import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		
		
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("����° ���� �Է� : ");
		int num3 = sc.nextInt();
		
		int temp =num1;
		
		if(num2 <num1) {
			temp = num1;
			
			num1 = num2;
			
			num3 = temp;
		}
		if(num3 <num1) {
			temp = num1;
			
			num1 = num2;
			
			num3 = temp;
		}
		if(num3 <num2) {
			num1 = num2;
			
			num2 = num3;
			
			num3 = temp;
		}
		
//		num1 = num2;
//		
//		num2 = num3;
//		
//		num3 = temp;
		
		System.out.println(num1 + " " + num2+" "+ num3+" ");
		
		sc.close();
		

	}

}
