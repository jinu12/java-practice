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
			//�ݵ�� �ѹ��� �����Ѵ�.
			//�ݺ������� �ڵ�
			
		}while(num<5);
		sc.close();

	}

}
