
public class CarMain {

	public static void main(String[] args) {
		
		Car.showSum(); 		//Ŭ���� �޼ҵ� ȣ�� static�� ��ü �������� ȣ���� ������
		
		Car Car1 = new Car();
		Car1.setCar(100, 51.3);
		
		Car.showSum();
		
		Car car2 = new Car();
		car2.setCar(4567, 50.47);
		
		Car.showSum();

	}

}
