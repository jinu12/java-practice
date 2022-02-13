import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		while(i<=10) {
			System.out.println(num+"*"+i+"= "+(num*i));
			i++;
		}
		
		num =1;
		
		do {
			System.out.println();
			//반드시 한번은 실행한다.
			//반복실행할 코드
			
		}while(num<5);
		sc.close();

	}

}
