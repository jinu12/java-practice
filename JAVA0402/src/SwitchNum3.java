
public class SwitchNum3 {

	public static void main(String[] args) {
		
//		int num1 = 5; // num1:5(0101)
//		int num2 = 3; // num2:3(0011)
//		
//		num1 = num1 ^ num2; //num1 : 8(1000) num2 : 3(0011)
//		num2 = num1 ^ num2; //num1 : 8(1000) num2 : 5(0101)
//		num1 = num1 ^ num2; //num1 : 3(0011) num2 : 5(0101)
		
		int num1 = 3;
		int num2 = 5;
		
		num2 = num2 ^ num1;
		num1 = num2 ^ num1;
		num2 = num2 ^ num1;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
