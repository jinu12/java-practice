
public class SwitchNum2 {

	public static void main(String[] args) {
		
//		int num1 = 5;
//		int num2 = 3;
//		
//		num1 = num1 + num2; //num1 : 8 num2 : 3
//		num2 = num1 - num2; //num1 : 8 num2 : 5
//		num1 = num1 - num2; //num1 : 3 num2 : 5
		
		int num1 = 3;
		int num2 = 5;
		
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
