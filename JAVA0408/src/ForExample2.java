import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		System.out.println("���� �Է��Ͻÿ�.");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(num+"*"+ i + "= "+ (i*num) );
		}
		sc.close();

	}

}
