import java.util.Scanner;

public class TestMain1 {

	public static void main(String[] args) {
		
		//�Լ� �ϳ��� �Է� �޾Ƽ� �Է¹��� ������ ���丮���� ����Ͽ� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		// ���� : 5 -> 5*4*3*2*1
		
		System.out.println("������ �Է����ּ���: ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int pack = 1;
		
		for(int i=num;i>0;i--) {
			
			System.out.print(i +"*");
			pack = pack *i; //pack *= i;
			
		}
		System.out.println("");
		System.out.print( "��� :" + pack);
		
//		int i = num;
//		while(i>0) {
//			i--;
//		}
		
		sc.close();

	}

}
