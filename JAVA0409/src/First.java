import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է�");
		
		
		int num1 = sc.nextInt();
		
		System.out.println("�ι�° ���� �Է�");
		int num2 = sc.nextInt();
		System.out.println("================");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.println("================");
		
		System.out.println("�޴� ���� :");
		
		int mun = sc.nextInt();
		if(mun==1) {
			System.out.println("���� ��� :"+(num1+num2));
		}else if(mun ==2) {
			System.out.println("���� ���:"+(num1-num2));
		}else if(mun ==3) {
			System.out.println("���� ��� :" +(num1*num2));
		}else {
			if(num1>num2) {
				System.out.println("������ ��� : ����"+(num1 / num2));
				System.out.println("�������� "+(num1%num2));
			}else {
				System.out.println("������ ��� : ����"+(num2 / num1));
				System.out.println("�������� "+(num2%num1));
			}
		}
		sc.close();
		
		
	}

}
