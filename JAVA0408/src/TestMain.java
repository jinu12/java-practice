import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2���� ������ �Է��Ͻÿ�.");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		if(num1 == num2) {
//			System.out.println("�� ���ڴ� �����ϴ�.");
//		}else if(num1<num2) {
//			System.out.println(num1+"����"+ num2+"�� Ů�ϴ�.");
//		}else {
//			System.out.println(num2+"����"+ num1+"�� Ů�ϴ�.");
//		}
//		���ǽ� ? �� : ���� ;
		String str = num1 > num2 ? num1 +"����" + num2 + "Ů�ϴ�."  : num2 + "����"+ num1 + "Ů�ϴ�.";
		System.out.println(str);
		sc.close();
	}

}
