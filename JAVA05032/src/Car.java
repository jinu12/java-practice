
public class Car implements iVehicle{

	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("���� ��ȣ�� " +num + "�̸� , ���� ���� " + gas+"�� �ڵ����� ����������ϴ�.");
	}
	
	
	@Override
	public void show() {
		System.out.println("������ȣ�� "+num+"�Դϴ�.");
		System.out.println("���� ���� "+gas+"�Դϴ�.");
		
	}

}
