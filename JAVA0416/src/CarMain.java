
public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.number = 1234;
		
		car1.gas = 10.5;
		//setter
		
		//System.out.println("������ȣ�� " + car1.number + "�Դϴ�.");
		//System.out.println("��������� " + car1.gas + "�Դϴ�.");
		
		//�޼ҵ带 ȣ���ߴ�.(�޼ҵ带 �����ߴ�.)
		car1.show();
		int n = car1.getNumber();
		System.out.println("���޹��� ������ȣ" + n + "�Դϴ�.");
		car1.setNumber(7777);
//		car1.setGas(50,5.0);
		car1.setInfo(5, 2.4);
		
		Car car2 = new Car();
		
		car2.number = 312;
		car2.gas = 10.5;
		
		car2.show();
		
		System.out.println("������ȣ�� " + car2.number + "�Դϴ�.");
		System.out.println("��������� " + car2.gas + "�Դϴ�.");
		
		

		
	}

}
