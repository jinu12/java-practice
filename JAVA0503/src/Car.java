
public class Car extends Vehicle {

	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("������ȣ"+num+", �����"+gas + "�� �ڵ����� ����� �����ϴ�.");
	}
	
	public void CarMethod() {
		System.out.println("�ڵ��� �޼ҵ� �Դϴ�.");
	}
	
	
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("������ȣ�� " + num + "�Դϴ�.");
		System.out.println("������� " + gas + "�Դϴ�.");
		System.out.println("�ӵ���  " + speed  + "�Դϴ�.");
		
	}
	


}
