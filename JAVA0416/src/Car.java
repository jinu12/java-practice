
public class Car {
	public int number;
	public double gas;
	

	
	/*
	 *   ���� ���� ��(type) �޼ҵ�(method) ��Ī (�μ� ���) {
	 *   		����
	 *   		return ��;
	 *   }
	 */
	
	public void show() {
		System.out.println("���� ��ȣ�� " +number+ "�Դϴ�.");
		System.out.println("���� ���� ���� " +gas+ "�Դϴ�.");
	}
	
	public void showCar() {
		System.out.println("���� ��ȣ�� " +number+ "�Դϴ�.");
		show();
		System.out.println("���� ��ȣ�� " +number+ "�Դϴ�.");
	}
	
	//�Ķ��Ÿ, �μ�, �Ű�����, �ƱԸ�Ʈ
	public void setNumber(int number) {
		this.number = number;
		System.out.println("���� ��ȣ�� " + number + "���� �ٲپ����ϴ�.");
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("����� ���� ���� " +gas+ "�Դϴ�.");
		
	}
	public int getNumber() {
		return number;
	}
	public void setInfo(int n,double g) {
		number = n;
		gas = g;
		System.out.println("������ ��ȣ�� ����Ǿ����ϴ�.");
	}
}
