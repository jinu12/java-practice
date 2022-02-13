import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력 : ");
		
		
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 수를 입력 : ");
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
