
public class Plane extends Vehicle {

	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("����� ��ȣ�� "+flight + "�� ����Ⱑ ����������ϴ�.");
	}
	
	public void PlaneMethod() {
		System.out.println("����� �޼ҵ� �Դϴ�.");
	}
	
	
	
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("����� ��ȣ�� "+flight + "�Դϴ�.");
		System.out.println("�ӵ��� "+speed+ "�Դϴ�.");
	}

}
