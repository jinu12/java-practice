
public class Car {
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		sum++;		//�����ڰ� ȣ��� ��, Ŭ���� ���� sum�� ���� 1 ���� ��Ų��.
		System.out.println("�ڵ����� ����������ϴ�.");
		
	}
	
	public void setCar(int n, double g) {
		num =n;
		gas =g;
		System.out.println("���� ��ȣ��"+num+"����, ���� ����"+gas+"�� �ٲپ����ϴ�.");
	}
	
	public static void showSum() {
		System.out.println("�ڵ����� ��� "+sum+" �� �ֽ��ϴ�.");
	}
	public void show() {
		System.out.println("���� ��ȣ�� "+num+"�Դϴ�.");
		System.out.println("���� ���� "+gas+"�Դϴ�.");
	}

}
