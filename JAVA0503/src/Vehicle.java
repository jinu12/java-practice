
public abstract class Vehicle {

	protected int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("�ӵ���" + speed + "���� �����߽��ϴ�.");
	}
		
		 abstract void show();
}
