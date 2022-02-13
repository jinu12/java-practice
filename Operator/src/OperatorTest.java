import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		System.out.print("연산을 위하여 숫자와 연산자 입력: ");
		String expr = keyin.next();
		
		int result = 0, second;
		String op;

		try {
			result = Integer.parseInt(expr.substring(0, 1));

			for(int i = 1; i < expr.length() - 1; i += 2) {
				op = expr.substring(i, i+1);
				second = Integer.parseInt(expr.substring(i + 1, i + 2));

				switch (op) {
				case "+" : 
					result = result + second;
					break;
				case "-" : 
					result = result - second;
					break;
				case "*" : 
					result = result * second;
					break;
				case "/" : 
					if(second == 0) throw new Exception();
					result = result / second;
					break;
				default : 
					throw new Exception();	
				}
			}
		} catch(Exception e) {
			System.out.println("연산식이 잘못되어 연산을 수행할 수 없습니다.");
			return;
		}
		System.out.println("결과 : " + result);
	}
}
